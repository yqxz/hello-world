package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Purchasedetial implements Serializable{
		/**
		 * CREATE TABLE `purchasedetial` (
			  `purId` varchar(32) NOT NULL COMMENT '�ɹ�����',
			  `supName` varchar(32) NOT NULL COMMENT '��Ӧ������',
			  `matId` varchar(32) NOT NULL COMMENT '����ID',
			  `matName` varchar(32) NOT NULL COMMENT '��������',
			  `matCategory` varchar(32) NOT NULL COMMENT '�������',
			  `matSpec` varchar(32) NOT NULL COMMENT '����ͺ�',
			  `metering` varchar(32) NOT NULL COMMENT '������λ',
			  `unitPrice` double NOT NULL COMMENT '����',
			  `quantity` int(11) NOT NULL COMMENT '�ɹ�����',
			  `arriveNumber` int(11) NOT NULL DEFAULT '0' COMMENT '��������',
			  `inStoreNumber` int(11) NOT NULL DEFAULT '0' COMMENT '�������',
			  `expectDate` varchar(32) DEFAULT NULL COMMENT 'Ԥ�Ƶ�������',
			  `amount` double NOT NULL COMMENT '���',
			  PRIMARY KEY (`purId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�ɹ�������ϸ��'

		 */
	
		private String purId;
		private String supName;
		private String matId;
		private String matName;
		private String matCategory;
		private String matSpec;
		private String metering;
		private double unitPrice;
		private int quantity;
		private int arriveNumber;
		private int inStoreNumber;
		private String expectDate;
		private double amount;
		
		
		public String getPurId() {
			return purId;
		}
		public void setPurId(String purId) {
			this.purId = purId;
		}
		public String getSupName() {
			return supName;
		}
		public void setSupName(String supName) {
			this.supName = supName;
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
		public String getMatCategory() {
			return matCategory;
		}
		public void setMatCategory(String matCategory) {
			this.matCategory = matCategory;
		}
		public String getMatSpec() {
			return matSpec;
		}
		public void setMatSpec(String matSpec) {
			this.matSpec = matSpec;
		}
		public String getMetering() {
			return metering;
		}
		public void setMetering(String metering) {
			this.metering = metering;
		}
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getArriveNumber() {
			return arriveNumber;
		}
		public void setArriveNumber(int arriveNumber) {
			this.arriveNumber = arriveNumber;
		}
		public int getInStoreNumber() {
			return inStoreNumber;
		}
		public void setInStoreNumber(int inStoreNumber) {
			this.inStoreNumber = inStoreNumber;
		}
		public String getExpectDate() {
			return expectDate;
		}
		public void setExpectDate(String expectDate) {
			this.expectDate = expectDate;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		@Override
		public String toString() {
			return "Purchasedetial [purId=" + purId + ", supName=" + supName + ", matId=" + matId + ", matName="
					+ matName + ", matCategory=" + matCategory + ", matSpec=" + matSpec + ", metering=" + metering
					+ ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", arriveNumber=" + arriveNumber
					+ ", inStoreNumber=" + inStoreNumber + ", expectDate=" + expectDate + ", amount=" + amount + "]";
		}
		
		
		
		
}
