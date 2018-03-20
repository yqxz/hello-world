package org.world.model;

import java.io.Serializable;
//�ɹ�������ϸ��
@SuppressWarnings("serial")
public class Purchasedetial implements Serializable {
	private String purId;        //�ɹ�������
	private int supId;        //��Ӧ�̱��
	private int matId;        //���ϱ��
	private String matName;      //��������
	private String metering;     //������λ
	private double unitPrice;    //����
	private int quantity;        //�ɹ�����
	private int arriveNumber;
	private int inStoreNumber;
	private String expectDate;   //Ԥ�Ƶ�������
	private double amount;       //���
	
	
	
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
				+ ", metering=" + metering + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", arriveNumber="
				+ arriveNumber + ", inStoreNumber=" + inStoreNumber + ", expectDate=" + expectDate + ", amount="
				+ amount + "]";
	}
	
	
	
	
	
	
	

}
