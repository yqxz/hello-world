package org.world.model;

import java.io.Serializable;

public class StoreGoods implements Serializable{
	private String inStoreId;    //入库单号
	private String repName;      //仓库名称
	private int variety;         //品种数量
	private int totalNumber;     //货物总数
	private String inStoreDate;  //入库日期
	private String userId;       //职工编号
	private String userName;     //职工名称
	private double totalMoney;   //合计金额
	public String getInStoreId() {
		return inStoreId;
	}
	public void setInStoreId(String inStoreId) {
		this.inStoreId = inStoreId;
	}
	public String getRepName() {
		return repName;
	}
	public void setRepName(String repName) {
		this.repName = repName;
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
	public String getInStoreDate() {
		return inStoreDate;
	}
	public void setInStoreDate(String inStoreDate) {
		this.inStoreDate = inStoreDate;
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
	public double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
	@Override
	public String toString() {
		return "LibraryGoods [inStoreId=" + inStoreId + ", repName=" + repName + ", variety=" + variety
				+ ", totalNumber=" + totalNumber + ", inStoreDate=" + inStoreDate + ", userId=" + userId + ", userName="
				+ userName + ", totalMoney=" + totalMoney + "]";
	}
	

}

