package org.world.entity;

import java.io.Serializable;

public class PurchasedetialGoods implements Serializable {
	private String accId;    //到货编号
	private String purId;    //采购编号
	private String  matId;   //材料编号
	private String matName;  //材料名称
	private String proDate;  //生产日期
	private String valDate;  //有效期至
	private int accNumber;   //数量
	private String supName;  //供应商名称
	
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
