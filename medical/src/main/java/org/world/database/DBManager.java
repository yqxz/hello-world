package org.world.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//管理当前程序和数据库之间的交互
public abstract class DBManager {
	//线程空间
	private ThreadLocal<Connection> threadLocal=new ThreadLocal<>();
	
	//匿名静态块
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 创建连接
	 * @return 连接对象
	 * @throws SQLException
	 */
	public Connection openConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/db_yygl?useSSL=true";
		Connection conn=threadLocal.get();
		if(conn==null) {
			conn=DriverManager.getConnection(url,"root","1225");
			threadLocal.set(conn);
		}
		return conn;
	}
	
	/**
	 * 关闭连接
	 * @param conn 需要关闭的连接对象
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
	 * 执行无结果集的SQL命令
	 * @param conn 数据库的连接对象
	 * @param sql SQL命令
	 * @param obs 参数(?)
	 * @return 受影响的行数
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
