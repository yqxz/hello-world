package org.world.model;

public class Tb_check {
	/**
	 * CREATE TABLE `tb_check` (
		  `cheId` varchar(32) NOT NULL COMMENT '���鵥ID',
		  `batchNumber` varchar(32) NOT NULL COMMENT '����',
		  `matId` varchar(32) NOT NULL COMMENT 'ԭ��ID',
		  `matName` varchar(32) NOT NULL COMMENT 'ԭ������',
		  `purId` varchar(32) NOT NULL COMMENT '�ɹ�����',
		  `waterIndex` varchar(32) DEFAULT NULL COMMENT '����ˮ��',
		  `impurity` varchar(32) DEFAULT NULL COMMENT '���ʺ���',
		  `cheTime` varchar(32) NOT NULL COMMENT '���ʱ��',
		  `grade` enum('�ϸ�','�������','���ϸ�') NOT NULL COMMENT '���ȼ�',
		  PRIMARY KEY (`cheId`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���鵥';
	 */
	
		private String cheId;
		private String batchNumber;
		private String matId;
		private String matName;
		private String purId;
		private String waterIndex;
		private String impurity;
		private String cheTime;
		private String grade;
		public String getCheId() {
			return cheId;
		}
		public void setCheId(String cheId) {
			this.cheId = cheId;
		}
		public String getBatchNumber() {
			return batchNumber;
		}
		public void setBatchNumber(String batchNumber) {
			this.batchNumber = batchNumber;
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
		public String getPurId() {
			return purId;
		}
		public void setPurId(String purId) {
			this.purId = purId;
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
		public String getCheTime() {
			return cheTime;
		}
		public void setCheTime(String cheTime) {
			this.cheTime = cheTime;	
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		
		
}
