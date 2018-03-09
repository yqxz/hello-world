package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Rawstore implements Serializable{
		/**
		 * CREATE TABLE `rawstore` (
			  `rawId` varchar(32) NOT NULL COMMENT '存货编码',
			  `matId` varchar(32) NOT NULL COMMENT '材料ID',
			  `matName` varchar(32) NOT NULL COMMENT '材料名称',
			  `metering` varchar(32) NOT NULL COMMENT '计量单位',
			  `rawSpec` varchar(32) NOT NULL COMMENT '规格型号',
			  `batchNumber` varchar(32) NOT NULL COMMENT '内部批号',
			  `repId` varchar(32) NOT NULL COMMENT '仓库编号',
			  `repName` varchar(32) NOT NULL COMMENT '仓库名称',
			  `proDate` varchar(32) NOT NULL COMMENT '生产日期',
			  `valDate` varchar(32) NOT NULL COMMENT '有效期至',
			  `extantNum` double NOT NULL COMMENT '现存量',
			  `originNumber` varchar(32) NOT NULL COMMENT '原始批号',
			  `waterIndex` varchar(32) NOT NULL COMMENT '超标水分',
			  `impurity` varchar(32) NOT NULL COMMENT '杂质含量',
			  `waitCheck` double NOT NULL COMMENT '到货/在检量',
			  PRIMARY KEY (`rawId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='原材料信息汇总表';
		 */
	
		private String rawId;
		private String matId;
		private String matName;
		private String metering;
		private String rawSpec;
		private String batchNumber;
		private String repId;
		private String repName;
		private String proDate;
		private String valDate;
		private double extantNum;
		private String originNumber;
		private String waterIndex;
		private String impurity;
		private double waitCheck;
		public String getRawId() {
			return rawId;
		}
		public void setRawId(String rawId) {
			this.rawId = rawId;
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
		public String getMetering() {
			return metering;
		}
		public void setMetering(String metering) {
			this.metering = metering;
		}
		public String getRawSpec() {
			return rawSpec;
		}
		public void setRawSpec(String rawSpec) {
			this.rawSpec = rawSpec;
		}
		public String getBatchNumber() {
			return batchNumber;
		}
		public void setBatchNumber(String batchNumber) {
			this.batchNumber = batchNumber;
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
		public double getExtantNum() {
			return extantNum;
		}
		public void setExtantNum(double extantNum) {
			this.extantNum = extantNum;
		}
		public String getOriginNumber() {
			return originNumber;
		}
		public void setOriginNumber(String originNumber) {
			this.originNumber = originNumber;
		}
		public String getWaterIndex() {
			return waterIndex;
		}
		public void setWaterIndex(String waterIndex) {
			this.waterIndex = waterIndex;
		}
		public String getImpurity() {
			return impurity;
		}
		public void setImpurity(String impurity) {
			this.impurity = impurity;
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
					+ ", rawSpec=" + rawSpec + ", batchNumber=" + batchNumber + ", repId=" + repId + ", repName="
					+ repName + ", proDate=" + proDate + ", valDate=" + valDate + ", extantNum=" + extantNum
					+ ", originNumber=" + originNumber + ", waterIndex=" + waterIndex + ", impurity=" + impurity
					+ ", waitCheck=" + waitCheck + "]";
		}
		
		
}
