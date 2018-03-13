package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PlanInfo implements Serializable{
	
	private int  planInfoId;	//计划单号
	private int matId;			//
	private String matName;    //材料名称
	private double unitPrice;   //预期单价
	private int quantity;       //数量
	private String planInfoDate;//日期
	private String loginName;	//员工姓名
	private boolean status;
	public String getPlanInfoDate() {
		return planInfoDate;
	}
	public void setPlanInfoDate(String planInfoDate) {
		this.planInfoDate = planInfoDate;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public int getPlanInfoId() {
		return planInfoId;
	}
	public void setPlanInfoId(int planInfoId) {
		this.planInfoId = planInfoId;
	}
	public String getMatName() {
		return matName;
	}
	public void setMatName(String matName) {
		this.matName = matName;
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
	public int getMatId() {
		return matId;
	}
	public void setMatId(int matId) {
		this.matId = matId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PlanInfo [planInfoId=" + planInfoId + ", matId=" + matId + ", matName=" + matName + ", unitPrice="
				+ unitPrice + ", quantity=" + quantity + ", planInfoDate=" + planInfoDate + ", loginName=" + loginName
				+ ", status=" + status + "]";
	}
	
	
	
	
	
	
	

}
