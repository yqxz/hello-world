package org.world.model;

public class Drug {
		/**
		 * CREATE TABLE `drug` (
			  `drugId` varchar(32) NOT NULL COMMENT '药品编号',
			  `drugCategory` varchar(32) NOT NULL COMMENT '药品类别',
			  `drugName` varchar(32) NOT NULL COMMENT '药品名称',
			  `metering` varchar(32) NOT NULL COMMENT '计量单位',
			  `drugSpec` varchar(32) NOT NULL COMMENT '药品规格',
			  `approvalNum` varchar(32) NOT NULL COMMENT '批准文号',
			  PRIMARY KEY (`drugId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='药品信息表';
		 */
	
		private String drugId;
		private String drugCategory;
		private String drugName;
		private String metering;
		private String drugSpec;
		private String approvalNum;
		public String getDrugId() {
			return drugId;
		}
		public void setDrugId(String drugId) {
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
		
		
}
