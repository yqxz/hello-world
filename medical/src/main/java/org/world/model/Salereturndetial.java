package org.world.model;

public class Salereturndetial {
		/**
		 * CREATE TABLE `salereturndetial` (
			  `stId` varchar(32) NOT NULL COMMENT '�����˻���ID',
			  `soId` varchar(32) NOT NULL COMMENT '���۶������',
			  `drugId` varchar(32) NOT NULL COMMENT 'ҩƷ���',
			  `drugName` varchar(32) NOT NULL COMMENT 'ҩƷ����',
			  `cusId` varchar(32) NOT NULL COMMENT '�ͻ�ID',
			  `cudName` varchar(32) NOT NULL COMMENT '�ͻ�����',
			  `unitPrice` double NOT NULL COMMENT '����',
			  `quantity` int(11) NOT NULL COMMENT '����',
			  `amount` double NOT NULL COMMENT '�ϼƽ��',
			  `reason` varchar(32) DEFAULT NULL COMMENT '�˻�ԭ��'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�����˻�����ϸ��';
		 */

		private String stId;
		private String soId;
		private String drugId;
		private String drugName;
		private String matSpec;
		private String metering;
		private String cusId;
		private String cusName;
		private double unitPrice;
		private int quantity;
		private double amount;
		private String reason;
		public String getStId() {
			return stId;
		}
		public void setStId(String stId) {
			this.stId = stId;
		}
		public String getSoId() {
			return soId;
		}
		public void setSoId(String soId) {
			this.soId = soId;
		}
		public String getDrugId() {
			return drugId;
		}
		public void setDrugId(String drugId) {
			this.drugId = drugId;
		}
		public String getDrugName() {
			return drugName;
		}
		public void setDrugName(String drugName) {
			this.drugName = drugName;
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
		@Override
		public String toString() {
			return "Salereturndetial [stId=" + stId + ", soId=" + soId + ", drugId=" + drugId + ", drugName=" + drugName
					+ ", matSpec=" + matSpec + ", metering=" + metering + ", cusId=" + cusId + ", cusName=" + cusName
					+ ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", amount=" + amount + ", reason="
					+ reason + "]";
		}




}
