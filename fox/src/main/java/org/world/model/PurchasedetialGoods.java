package org.world.model;

import java.io.Serializable;

public class PurchasedetialGoods implements Serializable {
	private String accId;    //�������
	private String purId;    //�ɹ����
	private String  matId;   //���ϱ��
	private String matName;  //��������
	private String proDate;  //��������
	private String valDate;  //��Ч����
	private int accNumber;   //����
	private String supName;  //��Ӧ������
	
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
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
	public String getMatName() {
		return matName;
	}
	public void setMatName(String matName) {
		this.matName = matName;
	}
	public String getProDate() {
		return proDate;
	}
	public void setProDate(String proDate) {
		this.proDate = proDate;
	}
	public String getValDate() {
		return valDate;
	}
	public void setValDate(String valDate) {
		this.valDate = valDate;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	@Override
	public String toString() {
		return "PurchasedetialGoods [accId=" + accId + ", purId=" + purId + ", matId=" + matId + ", matName=" + matName
				+ ", proDate=" + proDate + ", valDate=" + valDate + ", accNumber=" + accNumber + ", supName=" + supName
				+ "]";
	}
	
}
