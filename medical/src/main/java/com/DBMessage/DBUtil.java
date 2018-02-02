package com.DBMessage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DBUtil {

	
	//ÄäÃû¾²Ì¬¿é
static {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}


public Connection openConnection() throws SQLException {
	String url="jdbc:mysql://localhost:3306/medicine";
	return DriverManager.getConnection(url,"root","root");
}


public void clossConnection(Connection conn) throws SQLException {
	if(conn != null && !conn.isClosed()) {
		conn.close();
	}
}


public ResultSet query(Connection conn,String sql, Object...obj) throws SQLException {
	ResultSet rs=null;
	if(conn != null && !conn.isClosed()) {
		PreparedStatement ps=conn.prepareStatement(sql);
		if(obj != null) {
			for(int i=0;i<obj.length;i++) {
				ps.setObject(i+1,obj[i] );
			}
		}
		rs=ps.executeQuery();
	}
	return rs;
}


public int update(Connection conn,String sql,Object...obj) throws SQLException {
	int count = 0;
	if(conn != null && !conn.isClosed()) {
		PreparedStatement ps=conn.prepareStatement(sql);
		if(obj != null) {
			for(int i=0;i<obj.length;i++) {
				ps.setObject(i+1,obj[i] );
			}
		}
		count=ps.executeUpdate();
	}
	return count;
	
}
}
