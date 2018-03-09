package org.world.model;

public class Sosdetial {
		/**
		 * CREATE TABLE `sosdetial` (
			  `sosId` varchar(32) NOT NULL COMMENT '销售出库单编号',
			  `drugId` varchar(32) NOT NULL COMMENT '药品ID',
			  `drugName` varchar(32) NOT NULL COMMENT '药品名称',
			  `amount` int(11) NOT NULL COMMENT '数量'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售出库单明细表';
		 */

		private String sosId;
		private String drugId;
		private String drugName;
		private String matSpec;
		private String metering;
		private int amount;
		public String getSosId() {
			return sosId;
		}
		public void setSosId(String sosId) {
			this.sosId = sosId;
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
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		@Override
		public String toString() {
			return "Sosdetial [sosId=" + sosId + ", drugId=" + drugId + ", drugName=" + drugName + ", matSpec="
					+ matSpec + ", metering=" + metering + ", amount=" + amount + "]";
		}




}
