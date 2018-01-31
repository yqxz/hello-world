package org.world.model;

public class Saleplandetial {
		/**
		 * CREATE TABLE `saleplandetial` (
			  `spId` varchar(32) NOT NULL COMMENT '销售计划单号',
			  `durgId` varchar(32) NOT NULL COMMENT '药品编号',
			  `drugName` varchar(32) NOT NULL COMMENT '药品名称',
			  `amount` int(11) NOT NULL COMMENT '数量'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售计划单明细表'
		 */
	
		private String spId;
		private String drugId;
		private String drugName;
		private int amount;
		public String getSpId() {
			return spId;
		}
		public void setSpId(String spId) {
			this.spId = spId;
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
		
}
