package org.world.model;

public class InfoCheck {
	private String purId;    //�ɹ�����
	private String supName;   //��Ӧ������
	private String matName;   //��������
	private int quantity;     //�������˻���
	private int accNumber; //�ɹ�����(��ϸ)
	private String expectDate; //Ԥ�Ƶ�������
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
	public String getMatName() {
		return matName;
	}
	public void setMatName(String matName) {
		this.matName = matName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getExpectDate() {
		return expectDate;
	}
	public void setExpectDate(String expectDate) {
		this.expectDate = expectDate;
	}
	@Override
	public String toString() {
		return "InfoCheck [purId=" + purId + ", supName=" + supName + ", matName=" + matName + ", quantity=" + quantity
				+ ", accNumber=" + accNumber + ", expectDate=" + expectDate + "]";
	}
	

	
	
	

}
