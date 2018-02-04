package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable{
	/**
	 * CREATE TABLE `user` (
		  `userID` varchar(32) NOT NULL COMMENT '用户ID',
		  `loginName` varchar(32) NOT NULL COMMENT '登录名',
		  `userPwd` varchar(100) NOT NULL COMMENT '用户密码',
		  `userName` varchar(32) NOT NULL COMMENT '姓名',
		  `userPower` varchar(32) NOT NULL COMMENT '用户权限',
		  PRIMARY KEY (`userID`),
		  UNIQUE KEY `loginName` (`loginName`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表！';
	 */
	private String userId;
	private String loginName;
	private String userPwd;
	private String userName;
	private String userPower;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPower() {
		return userPower;
	}
	public void setUserPower(String userPower) {
		this.userPower = userPower;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", loginName=" + loginName + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", userPower=" + userPower + "]";
	}
	
}
