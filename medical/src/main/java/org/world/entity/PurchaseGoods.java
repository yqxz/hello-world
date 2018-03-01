package org.world.entity;

import java.io.Serializable;

public class PurchaseGoods implements Serializable{
	private String accId;     //到货单号
	private String accDate;   //到货日期
	private int variety;      //品种数量
	private int totalNumber;  //到货数量
	private String batchNumber;//内部批号
	private String originNumber;//原始批号
	private String askTime;     //请检日期
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
	public int getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
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
				+ totalNumber + ", batchNumber=" + batchNumber + ", originNumber=" + originNumber + ", askTime="
				+ askTime + "]";
	}
	
	
}
