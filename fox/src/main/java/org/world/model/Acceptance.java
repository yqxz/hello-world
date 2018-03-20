package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Acceptance implements Serializable{
	
		private String accId; //请检单号
		private String purId; //订单号
		private int matId;//原料Id
		private String matName;//原料名称
		private int totalNumber;//到货数
		private String batchNumber;//批号
		private String accDate;//到货日期--请检日期
		
		public String getAccId(){
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
		public String getAccDate() {
			return accDate;
		}
		public void setAccDate(String accDate) {
			this.accDate = accDate;
		}
		
		@Override
		public String toString() {
			return "Acceptance [accId=" + accId + ", purId=" + purId + ", matId=" + matId + ", matName=" + matName
					+ ", totalNumber=" + totalNumber + ", batchNumber=" + batchNumber + ", accDate=" + accDate + "]";
		}
		
		
	
		
	
		
		
}
