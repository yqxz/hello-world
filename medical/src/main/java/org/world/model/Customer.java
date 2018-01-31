package org.world.model;

public class Customer {
		/**
		 CREATE TABLE `customer` (
			  `cusId` varchar(32) NOT NULL COMMENT '�ͻ�ID',
			  `cusName` varchar(32) NOT NULL COMMENT '�ͻ�����',
			  `cusPhone` varchar(32) NOT NULL COMMENT '�ͻ��绰',
			  `address` varchar(32) DEFAULT NULL COMMENT '�ͻ���ַ',
			  `cusAccount` varchar(32) NOT NULL COMMENT '�����˺�',
			  `cusBank` varchar(32) NOT NULL COMMENT '��������',
			  PRIMARY KEY (`cusId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�ͻ���';
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
