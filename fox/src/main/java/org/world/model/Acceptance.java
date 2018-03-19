package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Acceptance implements Serializable{
	
		private String accId;
		private String purId;
		private int matId;
		private String matName;
		private int totalNumber;
		private String batchNumber;
		private String proDate;
		private String valDate;
		
		
		public String getProDate() {
			return proDate;
		}
		public void setProDate(String proDate) {
			this.proDate = proDate;
		}
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
		public int getTotalNumber() {
			return totalNumber;
		}
		public void setTotalNumber(int totalNumber) {
			this.totalNumber = totalNumber;
		}
		public String getBatchNumber() {
			return batchNumber;
		}
		public void setBatchNumber(String batchNumber) {
			this.batchNumber = batchNumber;
		}
		public String getValDate() {
			return valDate;
		}
		public void setValDate(String valDate) {
			this.valDate = valDate;
		}
		@Override
		public String toString() {
			return "Acceptance [matId=" + matId + ", matName=" + matName + ", totalNumber=" + totalNumber
					+ ", batchNumber=" + batchNumber +  ", valDate=" + valDate + "]";
		}
		
		
	
		
		
}
