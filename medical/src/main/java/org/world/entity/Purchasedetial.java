package org.world.entity;

import java.io.Serializable;
//采购订单明细表
public class Purchasedetial implements Serializable {
	private String purId;        //采购订单号
	private String supId;        //供应商编号
	private String matId;        //材料编号
	private String matName;      //材料名称
	private String matCategory;  //材料类别
	private String matSpec;      //规格型号
	private String metering;     //计量单位
	private double unitPrice;    //单价
	private int quantity;        //采购数量
	private String expectDate;   //预计到货日期
	private double amount;       //金额
	
	public String getPurId() {
		return purId;
	}
	public void setPurId(String purId) {
		this.purId = purId;
	}
	public String getSupId() {
		return supId;
	}
	public void setSupId(String supId) {
		this.supId = supId;
	}
	public String getMatId() {
		return matId;
	}
	public void setMatId(String matId) {
		this.matId = matId;
	}
	public String getMatName() {
		return matName;
	}
	public void setMatName(String matName) {
		this.matName = matName;
	}
	public String getMatCategory() {
		return matCategory;
	}
	public void setMatCategory(String matCategory) {
		this.matCategory = matCategory;
	}
	public String getMatSpec() {
		return matSpec;
	}
	public void setMatSpec(String matSpec) {
		this.matSpec = matSpec;
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
	@Override
	public String toString() {
		return "Purchasedetial [supId=" + supId + ", matId=" + matId + ", matName=" + matName + ", matCategory="
				+ matCategory + ", matSpec=" + matSpec + ", metering=" + metering + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + ", expectDate=" + expectDate + ", amount=" + amount + "]";
	}
	
	
	
	

}
