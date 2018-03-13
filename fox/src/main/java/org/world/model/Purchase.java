package org.world.model;

import java.io.Serializable;
//�ɹ���������
@SuppressWarnings("serial")
public class Purchase implements Serializable{
	private int purId;     //�ɹ�������
	private int userId;    //ְ�����
	private String userName;  //ְ������
	private String supName;   //��Ӧ������
	private String purTime;   //�ɹ�ʱ��
	private int variety;      //Ʒ������
	private int totalNumber;   //������
	private double totalMoney;  //�ܽ��
	
	public int getPurId() {
		return purId;
	}
	public void setPurId(int purId) {
		this.purId = purId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
	
	
	