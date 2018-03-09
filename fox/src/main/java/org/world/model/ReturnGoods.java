package org.world.model;

import java.io.Serializable;

public class ReturnGoods implements Serializable{
	private String retId;       //退货单号
	private int variety;        //退货种类
	private int retNumber;      //退货数量
	private String retDate;     //退货时间
	private double totalMoney;  //累计金额
	private String userId;      //负责人编号
	private String userName;    //负责人姓名
	public String getRetId() {
		return retId;
	}
	public void setRetId(String retId) {
		this.retId = retId;
	}
	public int getVariety() {
		return variety;
	}
	public void setVariety(int variety) {
		this.variety = variety;
	}
	public int getRetNumber() {
		return retNumber;
	}
	public void setRetNumber(int retNumber) {
		this.retNumber = retNumber;
	}
	public String getRetDate() {
		return retDate;
	}
	public void setRetDate(String retDate) {
		this.retDate = retDate;
	}
	public double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "ReturnGoods [retId=" + retId + ", variety=" + variety + ", retNumber=" + retNumber + ", retDate="
				+ retDate + ", totalMoney=" + totalMoney + ", userId=" + userId + ", userName=" + userName + "]";
	}
	
	

}
