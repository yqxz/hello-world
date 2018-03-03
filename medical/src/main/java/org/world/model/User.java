package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable{
	/**
	 * CREATE TABLE `user` (
		  `userID` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '�û�ID',
		  `loginName` varchar(32) NOT NULL COMMENT '��¼��',
		  `userPwd` varchar(100) NOT NULL COMMENT '�û�����',
		  `userName` varchar(32) NOT NULL COMMENT '����',
		  `userPower` varchar(32) NOT NULL COMMENT '�û�Ȩ��',
		  PRIMARY KEY (`userID`),
		  UNIQUE KEY `loginName` (`loginName`),
		  KEY `userPower` (`userPower`),
		  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`userPower`) REFERENCES `power` (`powerMark`)
		) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='�û���'
	 */
	private int userId;
	private String loginName;
	private String userPwd;
	private String userName;
	private String userPower;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
