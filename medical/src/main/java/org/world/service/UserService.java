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
		 * 根据loginName和userPwd判断登录！
		 * @param loginName
		 * @param userPwd
		 * @return 返回一个有userID  userName   userPower  值的User对象
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
		 * 修改密码
		 * @param userPwd  新密码
		 * @param userId   用户userId
		 * @return	修改结果！
		 */
		public boolean changePwd(String userPwd,String userId) {
			int count=0;
			try {
				count=userDao.updatePwd(userPwd, userId);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		/**	
		 * 修改权限
		 * @param userPower	新权限
		 * @param userId	用户userId
		 * @return			修改结果！！！
		 */
		public boolean changePower(String userPower,String userId) {
			int count=0;
			try {
				count=userDao.updatePwd(userPower, userId);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		/**
		 * 查询所有所有user表信息！
		 * @return   返回一个集合！每个对象只有  userId  userName  userPwd 三项属性值
		 */
		public List<User> queryAll(){
			List<User> userList=null;
			try {
				userList=userDao.queryAll();
			} catch (SQLException e) {
				logger.debug(e);
			}
			return userList;
		}
		
		/**
		 * 开出员工！删除用户表信息
		 * @param userId
		 * @return  turn/false
		 */
		public boolean fire(String userId) {
			int count=0;
			try {
				count=userDao.delete(userId);
			} catch (SQLException e) {
				logger.debug(e);
			}
			return count>0?true:false;
		}
		
		
		
		
		
		
		
		
		
		
}
