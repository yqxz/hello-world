package org.world.model;

public class Purchasedetial {
		/**
		 * CREATE TABLE `purchasedetial` (
	  `purId` varchar(32) NOT NULL COMMENT '采购单号',
	  `supID` varchar(32) NOT NULL COMMENT '供应商编号',
	  `matId` varchar(32) NOT NULL COMMENT '材料ID',
	  `matName` varchar(32) NOT NULL COMMENT '材料名称',
	  `matCategory` varchar(32) NOT NULL COMMENT '材料类别',
	  `matSpec` varchar(32) NOT NULL COMMENT '规格型号',
	  `metering` varchar(32) NOT NULL COMMENT '计量单位',
	  `unitPrice` double NOT NULL COMMENT '单价',
	  `quantity` int(11) NOT NULL COMMENT '采购数量',
	  `expectDate` varchar(32) DEFAULT NULL COMMENT '预计到货日期',
	  `amount` double NOT NULL COMMENT '金额',
	  PRIMARY KEY (`purId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购订单明细表';
		 */
	
		private String purId;
		private String supId;
		private String matId;
		private String matName;
		private String matCategory;
		private String matSpec;
		private String metering;
		private double unitPrice;
		private int quantity;
		private String expectDate;
		private double amount;
		
		
		public String getPurId() {
			return purId;
		}
		public void setPurId(String purId) {
			this.purId = purId;
		}
		public String getSupId() {
			return supId;
		}
		public void setSupId(String supId) {
			this.supId = supId;
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
		
		
}
