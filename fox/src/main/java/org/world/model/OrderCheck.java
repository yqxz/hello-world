package org.world.model;

import java.io.Serializable;

public class OrderCheck implements Serializable{
	private String purId;
	private String supName;
	private int totalNumber;
	private double totalMoney;
	private String matName;
	private String metering;
	private double unitPrice;
	private int quantity;
	private double amount;
	private String expectDate;
	public String getPurId() {
		return purId;
	}
	public void setPurId(String purId) {
		this.purId = purId;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
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
	public String getMatName() {
		return matName;
	}
	public void setMatName(String matName) {
		this.matName = matName;
	}
	public String getMetering() {
		return metering;
	}
	public void setMetering(String metering) {
		this.metering = metering;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getExpectDate() {
		return expectDate;
	}
	public void setExpectDate(String expectDate) {
		this.expectDate = expectDate;
	}
	@Override
	public String toString() {
		return "OrderCheck [purId=" + purId + ", supName=" + supName + ", totalNumber=" + totalNumber + ", totalMoney="
				+ totalMoney + ", matName=" + matName + ", metering=" + metering + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + ", amount=" + amount + ", expectDate=" + expectDate + "]";
	}
	
	
	
	
}
