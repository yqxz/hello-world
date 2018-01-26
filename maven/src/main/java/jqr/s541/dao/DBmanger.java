package jqr.s541.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBmanger {
		private ThreadLocal<Connection> threadLocal=new ThreadLocal<Connection>();
		
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("连接数据库驱动加载失败-->");
				e.printStackTrace();
			}
		}
		
		public Connection openConnection() throws SQLException{
			String url="jdbc:mysql://localhost:3306/food?useSSL=true";
			String user="root";
			String password="1225";
			Connection conn=null;
			if((conn=threadLocal.get())==null){
				conn=DriverManager.getConnection(url, user, password);
				threadLocal.set(conn);
			}
			return conn;
		}
		
		public void closeConnection() throws SQLException{
			Connection conn=threadLocal.get();
			if(conn!=null&&!conn.isClosed()) {
				conn.close();
				threadLocal.set(null);
			}
		}
		
		public ResultSet update(String sql,Object...obs) {
			
			return null;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
