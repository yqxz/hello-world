package org.world.model;

public class Saleplandetial {
		/**
		 * CREATE TABLE `saleplandetial` (
			  `spId` varchar(32) NOT NULL COMMENT '���ۼƻ�����',
			  `durgId` varchar(32) NOT NULL COMMENT 'ҩƷ���',
			  `drugName` varchar(32) NOT NULL COMMENT 'ҩƷ����',
			  `amount` int(11) NOT NULL COMMENT '����'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���ۼƻ�����ϸ��'
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
		@Override
		public String toString() {
			return "Saleplandetial [spId=" + spId + ", drugId=" + drugId + ", drugName=" + drugName + ", amount="
					+ amount + "]";
		}
		
}
