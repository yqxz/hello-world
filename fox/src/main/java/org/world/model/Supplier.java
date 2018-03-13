package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Supplier implements Serializable{
	/**
	 * CREATE TABLE `supplier` (
		  `supID` varchar(32) NOT NULL COMMENT '供应商编号',
		  `supName` varchar(32) NOT NULL COMMENT '名称',
		  `supAccount` varchar(32) NOT NULL COMMENT '银行账号',
		  `supBank` varchar(32) NOT NULL COMMENT '银行名称',
		  `supAddress` varchar(32) NOT NULL COMMENT '地址',
		  `supContact` varchar(32) NOT NULL COMMENT '联系人',
		  `supPhone` varchar(32) NOT NULL COMMENT '联系电话',
		  PRIMARY KEY (`supID`),
		  UNIQUE KEY `supName` (`supName`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='供应商表';
	 */
		private int supId;
		private String supName;
		private String supAccount;
		private String supBank;
		private String supAddress;
		private String supContact;
		private String supPhone;
		
		public int getSupId() {
			return supId;
		}
		public void setSupId(int supId) {
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
		@Override
		public String toString() {
			return "Supplier [supId=" + supId + ", supName=" + supName + ", supAccount=" + supAccount + ", supBank="
					+ supBank + ", supAddress=" + supAddress + ", supContact=" + supContact + ", supPhone=" + supPhone
					+ "]";
		}
		
}
