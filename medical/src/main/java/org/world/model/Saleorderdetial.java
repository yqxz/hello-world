package org.world.model;

public class Saleorderdetial {
		/**
		 * CREATE TABLE `saleorderdetial` (
			  `soId` varchar(32) NOT NULL COMMENT '���۶�����',
			  `drugId` varchar(32) NOT NULL COMMENT 'ҩƷ���',
			  `drugName` varchar(32) NOT NULL COMMENT 'ҩƷ����',
			  `amount` int(11) NOT NULL COMMENT '����',
			  `unitPrice` double NOT NULL COMMENT '�ɽ�����'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���۶�����ϸ��'
		 */
	
		private String soId;
		private String drugId;
		private String drugName;
		private int amount;
		private double unitPrice;
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
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		
		
}	
