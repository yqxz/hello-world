package org.world.entity;

import java.io.Serializable;

public class StoreGoods implements Serializable{
	private String inStoreId;    //��ⵥ��
	private String repName;      //�ֿ�����
	private int variety;         //Ʒ������
	private int totalNumber;     //��������
	private String inStoreDate;  //�������
	private String userId;       //ְ�����
	private String userName;     //ְ������
	private double totalMoney;   //�ϼƽ��
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

