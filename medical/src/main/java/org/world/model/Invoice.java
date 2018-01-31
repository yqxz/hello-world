package org.world.model;

public class Invoice {
		/**
		 * CREATE TABLE `invoice` (
			  `invId` varchar(32) NOT NULL COMMENT '发票号',
			  `invType` varchar(32) NOT NULL COMMENT '发票类型',
			  `invDate` varchar(32) NOT NULL COMMENT '开票日期',
			  `taxRate` double NOT NULL COMMENT '税率',
			  `currency` varchar(32) NOT NULL COMMENT '币种',
			  `supName` varchar(32) DEFAULT NULL COMMENT '供应商名称',
			  `serType` varchar(32) NOT NULL COMMENT '业务类型',
			  `userId` varchar(32) NOT NULL COMMENT '业务员ID',
			  `userName` varchar(32) NOT NULL COMMENT '业务员姓名',
			  `userPower` varchar(32) NOT NULL COMMENT '部门名称',
			  `purId` varchar(32) NOT NULL COMMENT '订单号',
			  `totalMoney` double NOT NULL COMMENT '合计金额',
			  PRIMARY KEY (`invId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='发票单表';
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
