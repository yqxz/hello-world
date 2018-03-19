package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PurGoods implements Serializable{
		
		private String matId;
		private String matName;
		private String accDate;
		private int totalNumber;
		private String batchNumber;
		private String proDate;
		private String valDate;
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
		public String getAccDate() {
			return accDate;
		}
		public void setAccDate(String accDate) {
			this.accDate = accDate;
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
		@Override
		public String toString() {
			return "Acceptance [matId=" + matId + ", matName=" + matName + ", accDate=" + accDate + ", totalNumber="
					+ totalNumber + ", batchNumber=" + batchNumber + ", proDate=" + proDate + ", valDate=" + valDate
					+ "]";
		}
		
		
		
		
		
		
}
