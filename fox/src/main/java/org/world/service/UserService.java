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
		 * 修改权限
		 * @param userPower	新权限
		 * @param userId	用户userId
		 * @return			修改结果！！！
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
		 * 查询所有所有user表信息！
		 * @return   返回一个集合！每个对象只有  userId  userName  userPwd 三项属性值
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
		 * 开除员工！删除用户表信息
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
		 * 判断登录名是否重复
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
		 * 添加一个新的user用户
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
		 * @return 获得user表的数据总数
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
		
		public int getId(String name) {
			int count=0;
			try {
				count=userDao.getId(name);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return count;
		}
		
		
}
