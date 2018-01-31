package org.world.model;

public class User {
	/**
	 * CREATE TABLE `user` (
		  `userID` varchar(32) NOT NULL COMMENT '�û�ID',
		  `loginName` varchar(32) NOT NULL COMMENT '��¼��',
		  `userPwd` varchar(100) NOT NULL COMMENT '�û�����',
		  `userName` varchar(32) NOT NULL COMMENT '����',
		  `userPower` varchar(32) NOT NULL COMMENT '�û�Ȩ��',
		  PRIMARY KEY (`userID`),
		  UNIQUE KEY `loginName` (`loginName`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�û���';
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
	
}
