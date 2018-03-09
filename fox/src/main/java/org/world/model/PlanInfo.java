package org.world.model;

import java.io.Serializable;

public class PlanInfo implements Serializable{
	
	private String matName;    //材料名称
	private String matCategory; //材料类别
	private String supName;     //供应商名称
	private String matSpec;     //规格型号
	private String metering;    //计量单位
	private double unitPrice;   //单价
	private double amount;      //金额
	private int quantity;       //数量
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
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "PlanInfo [matName=" + matName + ", matCategory=" + matCategory + ", supName=" + supName + ", matSpec="
				+ matSpec + ", metering=" + metering + ", unitPrice=" + unitPrice + ", amount=" + amount + ", quantity="
				+ quantity + "]";
	}
	
	
	
	
	
	

}
