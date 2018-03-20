package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Drug implements Serializable{
	
		private int drugId;
		private String drugCategory;
		private String drugName;
		private String metering;
		private String spec;
		private String approvalNum;
		private String repName;
		
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
		
		public String getSpec() {
			return spec;
		}
		public void setSpec(String spec) {
			this.spec = spec;
		}
		public String getApprovalNum() {
			return approvalNum;
		}
		public void setApprovalNum(String approvalNum) {
			this.approvalNum = approvalNum;
		}
		
		public String getRepName() {
			return repName;
		}
		public void setRepName(String repName) {
			this.repName = repName;
		}
		@Override
		public String toString() {
			return "Drug [drugId=" + drugId + ", drugCategory=" + drugCategory + ", drugName=" + drugName
					+ ", metering=" + metering + ", spec=" + spec + ", approvalNum=" + approvalNum + "]";
		}
		
		
}
