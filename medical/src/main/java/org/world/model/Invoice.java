package org.world.model;

public class Invoice {
		/**
		 * CREATE TABLE `invoice` (
			  `invId` varchar(32) NOT NULL COMMENT '��Ʊ��',
			  `invType` varchar(32) NOT NULL COMMENT '��Ʊ����',
			  `invDate` varchar(32) NOT NULL COMMENT '��Ʊ����',
			  `taxRate` double NOT NULL COMMENT '˰��',
			  `currency` varchar(32) NOT NULL COMMENT '����',
			  `supName` varchar(32) DEFAULT NULL COMMENT '��Ӧ������',
			  `serType` varchar(32) NOT NULL COMMENT 'ҵ������',
			  `userId` varchar(32) NOT NULL COMMENT 'ҵ��ԱID',
			  `userName` varchar(32) NOT NULL COMMENT 'ҵ��Ա����',
			  `userPower` varchar(32) NOT NULL COMMENT '��������',
			  `purId` varchar(32) NOT NULL COMMENT '������',
			  `totalMoney` double NOT NULL COMMENT '�ϼƽ��',
			  PRIMARY KEY (`invId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ʊ����';
		 */
	
		private String invId;
		private String invType;
		private String  incDate;
		private String taxRate;
		private String currency;
		private String supName;
		private String serType;
		private String userId;
		private String userName;
		private String userPower;
		private String purId;
		private double totalmoney;
		public String getInvId() {
			return invId;
		}
		public void setInvId(String invId) {
			this.invId = invId;
		}
		public String getInvType() {
			return invType;
		}
		public void setInvType(String invType) {
			this.invType = invType;
		}
		public String getIncDate() {
			return incDate;
		}
		public void setIncDate(String incDate) {
			this.incDate = incDate;
		}
		public String getTaxRate() {
			return taxRate;
		}
		public void setTaxRate(String taxRate) {
			this.taxRate = taxRate;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public String getSupName() {
			return supName;
		}
		public void setSupName(String supName) {
			this.supName = supName;
		}
		public String getSerType() {
			return serType;
		}
		public void setSerType(String serType) {
			this.serType = serType;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPower() {
			return userPower;
		}
		public void setUserPower(String userPower) {
			this.userPower = userPower;
		}
		public String getPurId() {
			return purId;
		}
		public void setPurId(String purId) {
			this.purId = purId;
		}
		public double getTotalmoney() {
			return totalmoney;
		}
		public void setTotalmoney(double totalmoney) {
			this.totalmoney = totalmoney;
		}
		
}
