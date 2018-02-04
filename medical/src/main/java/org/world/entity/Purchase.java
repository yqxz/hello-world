package org.world.entity;

import java.io.Serializable;
//采购订单主表
public class Purchase implements Serializable{
	private String purId;     //采购订单号
	private String userId;    //职工编号
	private String userName;  //职工姓名
	private String supName;   //供应商名称
	private String purTime;   //采购时间
	private int variety;      //品种数量
	private int totalNumber;   //总数量
	private double totalMoney;  //总金额
	public String getPurId() {
		return purId;
	}
	public void setPurId(String purId) {
		this.purId = purId;
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
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public String getPurTime() {
		return purTime;
	}
	public void setPurTime(String purTime) {
		this.purTime = purTime;
	}
	public int getVariety() {
		return variety;
	}
	public void setVariety(int variety) {
		this.variety = variety;
	}
	public int getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
	public double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
	@Override
	public String toString() {
		return "Purchase [purId=" + purId + ", userId=" + userId + ", userName=" + userName + ", supName=" + supName
				+ ", purTime=" + purTime + ", variety=" + variety + ", totalNumber=" + totalNumber + ", totalMoney="
				+ totalMoney + "]";
	}
	
	


	
	
	
}
	
	
	