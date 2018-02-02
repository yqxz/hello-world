package com.entity;

import java.io.Serializable;

public class User implements Serializable {

	private String userID;
	private String loginName;
	private String userPwd;
	private String userName;
	private String userPower;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
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
		return "User [userID=" + userID + ", loginName=" + loginName + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", userPower=" + userPower + "]";
	}
	
}
