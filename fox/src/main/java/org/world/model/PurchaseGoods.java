package org.world.model;

import java.io.Serializable;

public class PurchaseGoods implements Serializable{
	private String accId;     //��������
	private String accDate;   //��������
	private int variety;      //Ʒ������
	private int totalNumber1;  //��������
	private String batchNumber;//�ڲ�����
	private String originNumber;//ԭʼ����
	private String askTime;     //�������
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getAccDate() {
		return accDate;
	}
	public void setAccDate(String accDate) {
		this.accDate = accDate;
	}
	public int getVariety() {
		return variety;
	}
	public void setVariety(int variety) {
		this.variety = variety;
	}
	public int getTotalNumber1() {
		return totalNumber1;
	}
	public void setTotalNumber(int totalNumber1) {
		this.totalNumber1 = totalNumber1;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public String getOriginNumber() {
		return originNumber;
	}
	public void setOriginNumber(String originNumber) {
		this.originNumber = originNumber;
	}
	public String getAskTime() {
		return askTime;
	}
	public void setAskTime(String askTime) {
		this.askTime = askTime;
	}
	@Override
	public String toString() {
		return "PurchaseGoods [accId=" + accId + ", accDate=" + accDate + ", variety=" + variety + ", totalNumber="
				+ totalNumber1 + ", batchNumber=" + batchNumber + ", originNumber=" + originNumber + ", askTime="
				+ askTime + "]";
	}
	
	
}
