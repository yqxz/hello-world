package org.world.model;

public class Customer {
		/**
		 CREATE TABLE `customer` (
			  `cusId` varchar(32) NOT NULL COMMENT '客户ID',
			  `cusName` varchar(32) NOT NULL COMMENT '客户名称',
			  `cusPhone` varchar(32) NOT NULL COMMENT '客户电话',
			  `address` varchar(32) DEFAULT NULL COMMENT '客户地址',
			  `cusAccount` varchar(32) NOT NULL COMMENT '银行账号',
			  `cusBank` varchar(32) NOT NULL COMMENT '银行名称',
			  PRIMARY KEY (`cusId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户表';
		 */
			
	
		private String cusId;
		private String cusName;
		private String  cusPhone;
		private String address;
		private String  cusAccount;
		private String cusBank;
		public String getCusId() {
			return cusId;
		}
		public void setCusId(String cusId) {
			this.cusId = cusId;
		}
		public String getCusName() {
			return cusName;
		}
		public void setCusName(String cusName) {
			this.cusName = cusName;
		}
		public String getCusPhone() {
			return cusPhone;
		}
		public void setCusPhone(String cusPhone) {
			this.cusPhone = cusPhone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCusAccount() {
			return cusAccount;
		}
		public void setCusAccount(String cusAccount) {
			this.cusAccount = cusAccount;
		}
		public String getCusBank() {
			return cusBank;
		}
		public void setCusBank(String cusBank) {
			this.cusBank = cusBank;
		}
		
		
}
