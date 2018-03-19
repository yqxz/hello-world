package org.world.model;

import java.io.Serializable;
//采购订单明细表
@SuppressWarnings("serial")
public class Purchasedetial implements Serializable {
	private String purId;        //采购订单号
	private int supId;        //供应商编号
	private int matId;        //材料编号
	private String matName;      //材料名称
	private String metering;     //计量单位
	private double unitPrice;    //单价
	private int quantity;        //采购数量
	private int arriveNumber;
	private int inStoreNumber;
	private String expectDate;   //预计到货日期
	private double amount;       //金额
	
	
	
	public String getPurId() {
		return purId;
	}
	public void setPurId(String purId) {
		this.purId = purId;
	}
	public int getSupId() {
		return supId;
	}
	public void setSupId(int supId) {
		this.supId = supId;
	}
	
	public int getMatId() {
		return matId;
	}
	public void setMatId(int matId) {
		this.matId = matId;
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
	public String getExpectDate() {
		return expectDate;
	}
	public void setExpectDate(String expectDate) {
		this.expectDate = expectDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getArriveNumber() {
		return arriveNumber;
	}
	public void setArriveNumber(int arriveNumber) {
		this.arriveNumber = arriveNumber;
	}
	public int getInStoreNumber() {
		return inStoreNumber;
	}
	public void setInStoreNumber(int inStoreNumber) {
		this.inStoreNumber = inStoreNumber;
	}
	@Override
	public String toString() {
		return "Purchasedetial [purId=" + purId + ", supId=" + supId + ", matId=" + matId + ", matName=" + matName
				+ ", metering=" + metering + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", expectDate="
				+ expectDate + ", amount=" + amount + "]";
	}
	
	
	
	
	

}
