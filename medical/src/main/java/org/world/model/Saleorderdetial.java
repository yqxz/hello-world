package org.world.model;

public class Saleorderdetial {
		/**
		 * CREATE TABLE `saleorderdetial` (
			  `soId` varchar(32) NOT NULL COMMENT '销售订单号',
			  `drugId` varchar(32) NOT NULL COMMENT '药品编号',
			  `drugName` varchar(32) NOT NULL COMMENT '药品名称',
			  `amount` int(11) NOT NULL COMMENT '数量',
			  `unitPrice` double NOT NULL COMMENT '成交单价'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售订单明细表'
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
