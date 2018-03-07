package org.world.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.world.dao.UserDao;
import org.world.model.User;

public class UserService {
	private UserDao userDao=new UserDao();
	private Logger logger=Logger.getLogger(UserService.class);
	
		/**
		 * ����loginName��userPwd�жϵ�¼��
		 * @param loginName
		 * @param userPwd
		 * @return ����һ����userID  userName   userPower  ֵ��User����
		 */
		public  User check(String loginName,String userPwd) {
				User user=null;
				try {
					user=userDao.select(loginName, userPwd);
				} catch (SQLException e) {
					logger.debug(e);
				}
				return user;
		}
		
		/**
		 * �޸�����
		 * @param userPwd  ������
		 * @param userId   �û�userId
		 * @return	�޸Ľ����
		 */
		public boolean changePwd(String userPwd,String loginName) {
			int count=0;
			try {
				count=userDao.updatePwd(userPwd, loginName);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		/**	
		 * �޸�Ȩ��
		 * @param userPower	��Ȩ��
		 * @param userId	�û�userId
		 * @return			�޸Ľ��������
		 */
		public boolean changePower(String userPower,String loginName) {
			int count=0;
			try {
				count=userDao.updatePwd(userPower, loginName);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		/**
		 * ��ѯ��������user����Ϣ��
		 * @return   ����һ�����ϣ�ÿ������ֻ��  userId  userName  userPwd ��������ֵ
		 */
		public List<User> queryAll(int page,int rows){
			List<User> userList=null;
			try {
				userList=userDao.queryAll(page-1,rows);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return userList;
		}
		
		/**
		 * ����Ա����ɾ���û�����Ϣ
		 * @param userId
		 * @return  turn/false
		 */
		public boolean fire(String loginName){
			int count=0;
			try {
				count=userDao.delete(loginName);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		/**
		 * �жϵ�¼���Ƿ��ظ�
		 * @param name
		 * @return
		 */
		public boolean cheakName(String name) {
			boolean bool=false;
			try {
				bool=userDao.queryName(name);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return bool;
		}
		/**
		 * ���һ���µ�user�û�
		 * @param user
		 * @return
		 */
		public boolean add(User user) {
			int count=0;
			try {
				count=userDao.insert(user);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		/**
		 * 
		 * @return ���user�����������
		 */
		public int getCount() {
			int count=0;
			try {
				count=userDao.getCount();
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count;
		}
		
		
		
		
}
