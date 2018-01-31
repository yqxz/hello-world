package org.world.model;

public class Instoredetial {
	/**
	 * CREATE TABLE `instoredetial` (
		  `inStoreId` varchar(32) NOT NULL COMMENT '入库单号',
		  `purId` varchar(32) NOT NULL COMMENT '采购单号',
		  `matId` varchar(32) NOT NULL COMMENT '原料编号',
		  `batchNumber` varchar(32) NOT NULL COMMENT '批号',
		  `matName` varchar(32) NOT NULL COMMENT '原料名称',
		  `originNumber` varchar(32) NOT NULL COMMENT '原始批号',
		  `quantity` int(11) NOT NULL COMMENT '数量',
		  `amount` double NOT NULL COMMENT '金额'
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='入库单明细表';

	 */
	
		private String inStoreId;
		private String purId;
		private String matId;
		private String batchNumber;
		private String matName;
		private String originNumber;
		private int quantity;
		private double amount;
		public String getInStoreId() {
			return inStoreId;
		}
		public void setInStoreId(String inStoreId) {
			this.inStoreId = inStoreId;
		}
		public String getPurId() {
			return purId;
		}
		public void setPurId(String purId) {
			this.purId = purId;
		}
		public String getMatId() {
			return matId;
		}
		public void setMatId(String matId) {
			this.matId = matId;
		}
		public String getBatchNumber() {
			return batchNumber;
		}
		public void setBatchNumber(String batchNumber) {
			this.batchNumber = batchNumber;
		}
		public String getMatName() {
			return matName;
		}
		public void setMatName(String matName) {
			this.matName = matName;
		}
		public String getOriginNumber() {
			return originNumber;
		}
		public void setOriginNumber(String originNumber) {
			this.originNumber = originNumber;
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
		
		
}
