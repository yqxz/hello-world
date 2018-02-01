package org.world.model;

public class Supplier {
	/**
	 * CREATE TABLE `supplier` (
		  `supID` varchar(32) NOT NULL COMMENT '��Ӧ�̱��',
		  `supName` varchar(32) NOT NULL COMMENT '����',
		  `supAccount` varchar(32) NOT NULL COMMENT '�����˺�',
		  `supBank` varchar(32) NOT NULL COMMENT '��������',
		  `supAddress` varchar(32) NOT NULL COMMENT '��ַ',
		  `supContact` varchar(32) NOT NULL COMMENT '��ϵ��',
		  `supPhone` varchar(32) NOT NULL COMMENT '��ϵ�绰',
		  PRIMARY KEY (`supID`),
		  UNIQUE KEY `supName` (`supName`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ӧ�̱�';
	 */
		private String supId;
		private String supName;
		private String supAccount;
		private String supBank;
		private String supAddress;
		private String supContact;
		private String supPhone;
		public String getSupId() {
			return supId;
		}
		public void setSupId(String supId) {
			this.supId = supId;
		}
		public String getSupName() {
			return supName;
		}
		public void setSupName(String supName) {
			this.supName = supName;
		}
		public String getSupAccount() {
			return supAccount;
		}
		public void setSupAccount(String supAccount) {
			this.supAccount = supAccount;
		}
		public String getSupBank() {
			return supBank;
		}
		public void setSupBank(String supBank) {
			this.supBank = supBank;
		}
		public String getSupAddress() {
			return supAddress;
		}
		public void setSupAddress(String supAddress) {
			this.supAddress = supAddress;
		}
		public String getSupContact() {
			return supContact;
		}
		public void setSupContact(String supContact) {
			this.supContact = supContact;
		}
		public String getSupPhone() {
			return supPhone;
		}
		public void setSupPhone(String supPhone) {
			this.supPhone = supPhone;
		}
		
}