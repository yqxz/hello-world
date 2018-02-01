package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Tb_check implements Serializable{
	/**
	 * CREATE TABLE `tb_check` (
		  `cheId` varchar(32) NOT NULL COMMENT '���鵥ID',
		  `batchNumber` varchar(32) NOT NULL COMMENT '����',
		  `matId` varchar(32) NOT NULL COMMENT 'ԭ��ID',
		  `matName` varchar(32) NOT NULL COMMENT 'ԭ������',
		  `purId` varchar(32) NOT NULL COMMENT '�ɹ�����',
		  `waterIndex` varchar(32) NOT NULL DEFAULT 'δ��д' COMMENT '����ˮ��',
		  `impurity` varchar(32) NOT NULL DEFAULT 'δ��д' COMMENT '���ʺ���',
		  `cheTime` varchar(32) NOT NULL DEFAULT 'δ��д' COMMENT '���ʱ��',
		  `grade` enum('�ϸ�','�������','���ϸ�','δ��д') NOT NULL DEFAULT 'δ��д' COMMENT '���ȼ�',
		  PRIMARY KEY (`cheId`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���鵥'
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
		@Override
		public String toString() {
			return "Tb_check [cheId=" + cheId + ", batchNumber=" + batchNumber + ", matId=" + matId + ", matName="
					+ matName + ", purId=" + purId + ", waterIndex=" + waterIndex + ", impurity=" + impurity
					+ ", cheTime=" + cheTime + ", grade=" + grade + "]";
		}
		
		
}
