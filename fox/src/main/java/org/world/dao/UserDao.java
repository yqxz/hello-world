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
		 * ���ݵ�¼�����-->�û���  �û�ID  �û�Ȩ�� 
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
		 * �û��޸����룡-->���������ҪID�����û�����˵
		 * @param pass   ������
		 * @param name	   �û���¼��
		 * @return   1/0
		 * @throws SQLException
		 */
		public int updatePwd(String pass,String loginName) throws SQLException {
			String sql="update user set userPower=? where loginName=?";
			Object[] obs= {pass,loginName};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		/**
		 * ����Ա��Ȩ��
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
		 * ����UserIDɾ��һ��user�����Ϣ
		 * @param id
		 * @return
		 * @throws SQLException
		 */
		public int delete(String loginName) throws SQLException {
			String sql="delete from user where loginName=?";
			Object[] obs= {loginName};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			this.closeConnection();
			return count;
		}
		
		/** 
		 * ��ѯuser�����е�����(userId  userName  userPower)
		 * @return   һ��User����ļ���
		 * @throws SQLException
		 */
		@SuppressWarnings("all")
		public List<User> queryAll(int page,int rows) throws SQLException{
			List<User> userList=new ArrayList<>();
			String sql="select a.userId,a.loginName,a.userName,b.powerName from"
					+ " user as a inner join power as b "
					+ "on a.userPower=b.powerMark order by b.powerName limit ?,?";
			Object[] obs= {page*rows,rows};
			Connection conn=this.openConnection();
			ResultSet rs=this.query(conn, sql, obs);
			while(rs.next()){
				User user=new User();
				user.setUserId(rs.getInt("userId"));
				user.setLoginName(rs.getString("loginName"));
				user.setUserName(rs.getString("userName"));
				user.setUserPower(rs.getString("powerName"));
				userList.add(user);
			}
			this.closeConnection();
			return userList;
		}
		
		/**
		 * ��ѯloginName�Ƿ��ظ�
		 * @param name
		 * @return  
		 * @throws SQLException
		 */
		public boolean queryName(String name) throws SQLException {
			String loginName=null;
			String sql="select loginName from user where loginName=?";
			Object[] obs= {name};
			Connection conn=this.openConnection();
			ResultSet rs=this.query(conn, sql, obs);
			if(rs.next()) {
				loginName=rs.getString("loginName");
			}
			return loginName==null?false:true;
		}
		/**
		 * ���һ��user�û�
		 * @param user
		 * @return
		 * @throws SQLException
		 */
		public int insert(User user) throws SQLException {
			String sql="insert into user values(default,?,?,?,?)";
			Object[] obs= {user.getLoginName(),user.getUserPwd(),user.getUserName(),user.getUserPower()};
			Connection conn=this.openConnection();
			int count=this.update(conn, sql, obs);
			return count;
		}
		
		/**
		 * 
		 * @return ���user�������������
		 * @throws SQLException
		 */
		@SuppressWarnings("all")
		public int getCount() throws SQLException {
			String sql="select count(userId) from user";
			Connection conn=this.openConnection();
			ResultSet rs=this.query(conn, sql, null);
			int count=0;
			if(rs.next()) {
				count=rs.getInt(1);
			}
			return count;
		}
		
		
		
		
		
		
		
}
