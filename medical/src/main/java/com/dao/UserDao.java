package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.DBMessage.DBUtil;
import com.entity.User;



public class UserDao extends DBUtil {

	public User lodaUser(User user) throws SQLException {
		User u= null;
		String sql="select * from user where userName=? and userPwd=password(?)";
		Object[] obj= {user.getUserName(),user.getUserPwd()};
		Connection conn=this.openConnection();
		ResultSet rs=this.query(conn, sql, obj);
		while(rs.next()) {
			u=new User();
			u.setUserID(rs.getString("userID"));
			u.setLoginName(rs.getString("loginName"));
			u.setUserPwd(rs.getString("userPwd"));
			u.setUserName(rs.getString("userName"));
			u.setUserPower(rs.getString("userPower"));
		}
		this.clossConnection(conn);
		return u;
	}
}