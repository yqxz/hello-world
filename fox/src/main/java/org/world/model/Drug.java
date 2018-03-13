package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Drug implements Serializable{
	
		private int drugId;
		private String drugCategory;
		private String drugName;
		private String metering;
		private String drugSpec;
		private String approvalNum;
		
		public int getDrugId() {
			return drugId;
		}
		public void setDrugId(int drugId) {
			this.drugId = drugId;
		}
		public String getDrugCategory() {
			return drugCategory;
		}
		public void setDrugCategory(String drugCategory) {
			this.drugCategory = drugCategory;
		}
		public String getDrugName() {
			return drugName;
		}
		public void setDrugName(String drugName) {
			this.drugName = drugName;
		}
		public String getMetering() {
			return metering;
		}
		public void setMetering(String metering) {
			this.metering = metering;
		}
		public String getDrugSpec() {
			return drugSpec;
		}
		public void setDrugSpec(String drugSpec) {
			this.drugSpec = drugSpec;
		}
		public String getApprovalNum() {
			return approvalNum;
		}
		public void setApprovalNum(String approvalNum) {
			this.approvalNum = approvalNum;
		}
		@Override
		public String toString() {
			return "Drug [drugId=" + drugId + ", drugCategory=" + drugCategory + ", drugName=" + drugName
					+ ", metering=" + metering + ", drugSpec=" + drugSpec + ", approvalNum=" + approvalNum + "]";
		}
		
		
}
