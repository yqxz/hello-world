package org.world.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//����ǰ��������ݿ�֮��Ľ���
public abstract class DBManager {
	//�߳̿ռ�
	private ThreadLocal<Connection> threadLocal=new ThreadLocal<>();
	
	//������̬��
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��������
	 * @return ���Ӷ���
	 * @throws SQLException
	 */
	public Connection openConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/db_yygl";
		Connection conn=threadLocal.get();
		if(conn==null) {
			conn=DriverManager.getConnection(url,"root","1225");
			threadLocal.set(conn);
		}
		return conn;
	}
	
	/**
	 * �ر�����
	 * @param conn ��Ҫ�رյ����Ӷ���
	 * @throws SQLException
	 */
	public void closeConnection()throws SQLException {
		Connection conn=threadLocal.get();
		if(conn!=null && !conn.isClosed()) {
			conn.close();
			threadLocal.set(null);
		}
	}
	
	/**
	 * ִ���޽������SQL����
	 * @param conn ���ݿ�����Ӷ���
	 * @param sql SQL����
	 * @param obs ����(?)
	 * @return ��Ӱ�������
	 * @throws SQLException
	 */
	public int update(Connection conn,String sql,Object...obs)throws SQLException {
		int count=0;
		if(conn!=null && !conn.isClosed()) {
			PreparedStatement psment=conn.prepareStatement(sql);
			if(obs!=null) {
				for (int i = 0; i < obs.length; i++) {
					psment.setObject(i+1, obs[i]);
				}
			}
			count=psment.executeUpdate();
		}
		return count;
	}
	
	public ResultSet query(Connection conn,String sql,Object...obs)throws SQLException {
		ResultSet rs=null;
		if(conn!=null && !conn.isClosed()) {
			PreparedStatement psment=conn.prepareStatement(sql);
			if(obs!=null) {
				for (int i = 0; i < obs.length; i++) {
					psment.setObject(i+1, obs[i]);
				}
			}
			rs=psment.executeQuery();
		}
		return rs;
	}
}
