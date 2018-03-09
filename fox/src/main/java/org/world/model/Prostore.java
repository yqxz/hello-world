package org.world.model;

public class Prostore {
		/**
		 * CREATE TABLE `prostore` (
			  `proId` varchar(32) NOT NULL COMMENT '�������',
			  `drugId` varchar(32) NOT NULL COMMENT 'ҩƷID',
			  `drugName` varchar(32) NOT NULL COMMENT 'ҩƷ����',
			  `repId` varchar(32) NOT NULL COMMENT '�ֿ���',
			  `repName` varchar(32) NOT NULL COMMENT '�ֿ�����',
			  `inProDate` varchar(32) NOT NULL COMMENT '�������',
			  `approvalNum` varchar(32) NOT NULL COMMENT '��׼�ĺ�',
			  `metering` varchar(32) NOT NULL COMMENT '������λ',
			  `proSpec` varchar(32) NOT NULL COMMENT '��Ʒ���',
			  `proCategory` varchar(32) NOT NULL COMMENT '��Ʒ���',
			  `proNumber` int(11) DEFAULT NULL COMMENT '��Ʒ����',
			  `proDate` varchar(32) NOT NULL COMMENT '��������',
			  `valDate` varchar(32) NOT NULL COMMENT '��Ч����',
			  `extantNum` int(11) NOT NULL COMMENT '�ִ���',
			  PRIMARY KEY (`proId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ʒ��Ϣ����';
		 */
	
		private String proId;
		private String drugId;
		private String drugName;
		private String repId;
		private String repName;
		private String inProdate;
		private String approvalNum;
		private String metering;
		private String proSpec;
		private String proCategory;
		private int proNumber;
		private String proDate;
		private String valDate;
		private int extantNum;
		
		
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
		public String getInProdate() {
			return inProdate;
		}
		public void setInProdate(String inProdate) {
			this.inProdate = inProdate;
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
