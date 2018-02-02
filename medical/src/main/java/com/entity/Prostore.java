package com.entity;

import java.io.Serializable;

public class Prostore implements Serializable{

	private String proId;
	private String drugId;
	private String drugName;
	private String repId;
	private String repName;
	private String inProDate;
	private String approvalNum;private String metering;
	private String proSpec;
	private String proCategory;
	private int    proNumber;
	private String proDate;
	private String valDate;
	private int    extantNum;
	@Override
	public String toString() {
		return "Prostore [proId=" + proId + ", drugId=" + drugId + ", drugName=" + drugName + ", repId=" + repId
				+ ", repName=" + repName + ", inProDate=" + inProDate + ", approvalNum=" + approvalNum + ", metering="
				+ metering + ", proSpec=" + proSpec + ", proCategory=" + proCategory + ", proNumber=" + proNumber
				+ ", proDate=" + proDate + ", valDate=" + valDate + ", extantNum=" + extantNum + "]";
	}
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getDrugId() {
		return drugId;
	}
	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getRepId() {
		return repId;
	}
	public void setRepId(String repId) {
		this.repId = repId;
	}
	public String getRepName() {
		return repName;
	}
	public void setRepName(String repName) {
		this.repName = repName;
	}
	public String getInProDate() {
		return inProDate;
	}
	public void setInProDate(String inProDate) {
		this.inProDate = inProDate;
	}
	public String getApprovalNum() {
		return approvalNum;
	}
	public void setApprovalNum(String approvalNum) {
		this.approvalNum = approvalNum;
	}
	public String getMetering() {
		return metering;
	}
	public void setMetering(String metering) {
		this.metering = metering;
	}
	public String getProSpec() {
		return proSpec;
	}
	public void setProSpec(String proSpec) {
		this.proSpec = proSpec;
	}
	public String getProCategory() {
		return proCategory;
	}
	public void setProCategory(String proCategory) {
		this.proCategory = proCategory;
	}
	public int getProNumber() {
		return proNumber;
	}
	public void setProNumber(int proNumber) {
		this.proNumber = proNumber;
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
	public int getExtantNum() {
		return extantNum;
	}
	public void setExtantNum(int extantNum) {
		this.extantNum = extantNum;
	}
	
}
