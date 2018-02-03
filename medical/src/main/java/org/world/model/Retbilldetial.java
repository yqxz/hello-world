package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Retbilldetial implements Serializable{
		/**
		 * CREATE TABLE `retbilldetial` (
			  `retId` varchar(32) NOT NULL COMMENT '退货单号',
			  `purId` varchar(32) NOT NULL COMMENT '采购单号',
			  `batchNumber` varchar(32) NOT NULL COMMENT '批次',
			  `matId` varchar(32) NOT NULL COMMENT '原料ID',
			  `matName` varchar(32) NOT NULL COMMENT '原料名称',
			  `supId` varchar(32) NOT NULL COMMENT '供应商编号',
			  `uintPrice` double NOT NULL COMMENT '单价',
			  `quantity` int(11) NOT NULL COMMENT '数量',
			  `amount` double NOT NULL COMMENT '合计金额',
			  `reason` varchar(32) DEFAULT NULL COMMENT '退货原因'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='退货明细表';
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
		@Override
		public String toString() {
			return "Retbilldetial [retId=" + retId + ", purId=" + purId + ", batchNumber=" + batchNumber + ", matId="
					+ matId + ", matName=" + matName + ", supId=" + supId + ", unitPrice=" + unitPrice + ", quantity="
					+ quantity + ", amount=" + amount + ", reason=" + reason + "]";
		}
		
		
}
