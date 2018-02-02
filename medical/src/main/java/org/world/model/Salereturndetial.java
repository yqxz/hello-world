package org.world.model;

public class Salereturndetial {
		/**
		 * CREATE TABLE `salereturndetial` (
			  `stId` varchar(32) NOT NULL COMMENT '销售退货单ID',
			  `soId` varchar(32) NOT NULL COMMENT '销售订单编号',
			  `drugId` varchar(32) NOT NULL COMMENT '药品编号',
			  `drugName` varchar(32) NOT NULL COMMENT '药品名称',
			  `cusId` varchar(32) NOT NULL COMMENT '客户ID',
			  `cudName` varchar(32) NOT NULL COMMENT '客户名称',
			  `unitPrice` double NOT NULL COMMENT '单价',
			  `quantity` int(11) NOT NULL COMMENT '数量',
			  `amount` double NOT NULL COMMENT '合计金额',
			  `reason` varchar(32) DEFAULT NULL COMMENT '退货原因'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售退货单明细表';
		 */
	
		private String stId;
		private String soId;
		private String drugId;
		private String drugName;
		private String cusId;
		private String cudName;
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
		public String getCusId() {
			return cusId;
		}
		public void setCusId(String cusId) {
			this.cusId = cusId;
		}
		public String getCudName() {
			return cudName;
		}
		public void setCudName(String cudName) {
			this.cudName = cudName;
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
