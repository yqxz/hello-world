package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Rawstore implements Serializable{
	
		private String rawId;
		private int matId;
		private String matName;
		private String metering;
		private String spec;
		private String batchNumber;
		private String repName;
		private String proDate;
		private double extantNum;
		private double waitCheck;
		public String getRawId() {
			return rawId;
		}
		public void setRawId(String rawId) {
			this.rawId = rawId;
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
		public String getBatchNumber() {
			return batchNumber;
		}
		public void setBatchNumber(String batchNumber) {
			this.batchNumber = batchNumber;
		}
		public String getRepName() {
			return repName;
		}
		public void setRepName(String repName) {
			this.repName = repName;
		}
		public String getProDate() {
			return proDate;
		}
		public void setProDate(String proDate) {
			this.proDate = proDate;
		}
		public double getExtantNum() {
			return extantNum;
		}
		public void setExtantNum(double extantNum) {
			this.extantNum = extantNum;
		}
		public double getWaitCheck() {
			return waitCheck;
		}
		public void setWaitCheck(double waitCheck) {
			this.waitCheck = waitCheck;
		}
		@Override
		public String toString() {
			return "Rawstore [rawId=" + rawId + ", matId=" + matId + ", matName=" + matName + ", metering=" + metering
					+ ", spec=" + spec + ", batchNumber=" + batchNumber + ", repName=" + repName + ", proDate="
					+ proDate + ", extantNum=" + extantNum + ", waitCheck=" + waitCheck + "]";
		}
		
		
}
