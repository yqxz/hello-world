package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable{
	
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
