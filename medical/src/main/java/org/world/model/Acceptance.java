package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Acceptance implements Serializable{
		/**
		 * CREATE TABLE `acceptance` (
			  `accId` varchar(32) NOT NULL COMMENT '������ID',
			  `accDate` varchar(32) NOT NULL COMMENT '��������',
			  `variety` smallint(6) NOT NULL COMMENT 'Ʒ������',
			  `totalNumber` int(11) NOT NULL COMMENT '��������',
			  `batchNumber` varchar(32) NOT NULL COMMENT '�ڲ�����',
			  `originNumber` varchar(32) NOT NULL COMMENT 'ԭʼ����',
			  `askTime` varchar(32) NOT NULL COMMENT '�������',
			  PRIMARY KEY (`accId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�ɹ�����������'; 
		 */ 
	
		private String accId;
		private String accDate;
		private int variety;
		private int totalNumber;
		private String batchNumber;
		private String originNumber;
		private String askTime;
		
		
		public String getAccId() {
			return accId;
		}
		public void setAccId(String accId) {
			this.accId = accId;
		}
		public String getAccDate() {
			return accDate;
		}
		public void setAccDate(String accDate) {
			this.accDate = accDate;
		}
		public int getVariety() {
			return variety;
		}
		public void setVariety(int variety) {
			this.variety = variety;
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
		public String getOriginNumber() {
			return originNumber;
		}
		public void setOriginNumber(String originNumber) {
			this.originNumber = originNumber;
		}
		public String getAskTime() {
			return askTime;
		}
		public void setAskTime(String askTime) {
			this.askTime = askTime;
		}
		@Override
		public String toString() {
			return "Acceptance [accId=" + accId + ", accDate=" + accDate + ", variety=" + variety + ", totalNumber="
					+ totalNumber + ", batchNumber=" + batchNumber + ", originNumber=" + originNumber + ", askTime="
					+ askTime + "]";
		}
		
		
}
