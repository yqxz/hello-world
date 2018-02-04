package org.world.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.world.database.DBManager;
import org.world.model.User;

public class UserDao extends DBManager{
			
		/**
		 * 根据登录名获得-->用户名  用户ID  用户权限 
		 * @param id
		 * @param pass
		 * @return
		 * @throws SQLException
		 */
		public User select(String loginName,String pass) throws SQLException {
			String sql="select userId,userName,userPower from user where loginName=? and userPwd=?";
			Object[] obs= {loginName,pass};
			Connection conn=this.openConnection();
			ResultSet rs=this.query(conn, sql, obs);
			User user=null;
			if(rs.next()) {
				user=new User();
				user.setUserName(rs.getString("userName"));
				user.setUserPower(rs.getString("userPower"));
			}
			this.closeConnection();
			return user;
		}
		
		/**
		 * 用户修改密码！-->具体参数需要ID还是用户名再说
		 * @param pass   新密码
		 * @param name	   用户登录名
		 * @return   1/0
		 * @throws SQLException
		 */
		public int updatePwd(String pass,String id) throws SQLException {
			String sql="update user set userPwd=? where userId=?";
			Object[] obs= {pass,id};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		/**
		 * 更改员工权限
		 * @param pow
		 * @param name
		 * @return
		 * @throws SQLException
		 */
		public int updatePower(String pow,String id) throws SQLException {
			String sql="update user set userPower=? where userId=?";
			Object[] obs= {pow,id};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		/**
		 * 根据UserID删除一条user表的信息
		 * @param id
		 * @return
		 * @throws SQLException
		 */
		public int delete(String id) throws SQLException {
			String sql="delete from user where userId=?";
			Object[] obs= {id};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		/**
		 * 查询user表所有的数据(userId  userName  userPower)
		 * @return   一个User对象的集合
		 * @throws SQLException
		 */
		@SuppressWarnings("all")
		public List<User> queryAll() throws SQLException{
			List<User> userList=new ArrayList<>();
			String sql="select userId,userName,userPower from user";
			Connection conn=this.openConnection();
			ResultSet rs=this.query(conn, sql, null);
			while(rs.next()) {
				User user=new User();
				user.setUserId(rs.getString("userId"));
				user.setUserName(rs.getString("userName"));
				user.setUserPower(rs.getString("userPower"));
				userList.add(user);
			}
			this.closeConnection();
			return userList;
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
