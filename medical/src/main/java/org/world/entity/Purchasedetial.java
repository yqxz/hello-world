package org.world.entity;

import java.io.Serializable;
//�ɹ�������ϸ��
public class Purchasedetial implements Serializable {
	private String purId;        //�ɹ�������
	private String supId;        //��Ӧ�̱��
	private String matId;        //���ϱ��
	private String matName;      //��������
	private String matCategory;  //�������
	private String matSpec;      //����ͺ�
	private String metering;     //������λ
	private double unitPrice;    //����
	private int quantity;        //�ɹ�����
	private String expectDate;   //Ԥ�Ƶ�������
	private double amount;       //���
	
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
