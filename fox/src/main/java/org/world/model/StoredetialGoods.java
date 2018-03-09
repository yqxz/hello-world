package org.world.model;

import java.io.Serializable;

public class StoredetialGoods implements Serializable{
	private String inStoreId;  //�����
	private String purId;      //�ɹ�����
	private String matId;      //ԭ�ϱ��
	private String batchNumber; //����
	private String matName;      //ԭ������
	private String originNumber; //ԭʼ����
	private int quantity;        //����
	private double amount;      //���
	
	public String getInStoreId() {
		return inStoreId;
	}
	public void setInStoreId(String inStoreId) {
		this.inStoreId = inStoreId;
	}
	public String getPurId() {
		return purId;
	}
	public void setPurId(String purId) {
		this.purId = purId;
	}
	public String getMatId() {
		return matId;
	}
	public void setMatId(String matId) {
		this.matId = matId;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public String getMatName() {
		return matName;
	}
	public void setMatName(String matName) {
		this.matName = matName;
	}
	public String getOriginNumber() {
		return originNumber;
	}
	public void setOriginNumber(String originNumber) {
		this.originNumber = originNumber;
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
	@Override
	public String toString() {
		return "StoredetialGoods [inStoreId=" + inStoreId + ", purId=" + purId + ", matId=" + matId + ", batchNumber="
				+ batchNumber + ", matName=" + matName + ", originNumber=" + originNumber + ", quantity=" + quantity
				+ ", amount=" + amount + "]";
	}
	
	


	
	
	

}
