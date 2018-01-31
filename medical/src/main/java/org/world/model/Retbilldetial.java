package org.world.model;

public class Retbilldetial {
		/**
		 * CREATE TABLE `retbilldetial` (
			  `retId` varchar(32) NOT NULL COMMENT '�˻�����',
			  `purId` varchar(32) NOT NULL COMMENT '�ɹ�����',
			  `batchNumber` varchar(32) NOT NULL COMMENT '����',
			  `matId` varchar(32) NOT NULL COMMENT 'ԭ��ID',
			  `matName` varchar(32) NOT NULL COMMENT 'ԭ������',
			  `supId` varchar(32) NOT NULL COMMENT '��Ӧ�̱��',
			  `uintPrice` double NOT NULL COMMENT '����',
			  `quantity` int(11) NOT NULL COMMENT '����',
			  `amount` double NOT NULL COMMENT '�ϼƽ��',
			  `reason` varchar(32) DEFAULT NULL COMMENT '�˻�ԭ��'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�˻���ϸ��';
		 */
	
		private String retId;
		private String purId;
		private String batchNumber;
		private String matId;
		private String matName;
		private String supId;
		private double unitPrice;
		private int quantity;
		private double amount;
		private String reason;
		public String getRetId() {
			return retId;
		}
		public void setRetId(String retId) {
			this.retId = retId;
		}
		public String getPurId() {
			return purId;
		}
		public void setPurId(String purId) {
			this.purId = purId;
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
		public String getSupId() {
			return supId;
		}
		public void setSupId(String supId) {
			this.supId = supId;
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
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		
		
}
