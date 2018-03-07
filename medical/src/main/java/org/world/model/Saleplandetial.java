package org.world.model;

public class Saleplandetial {
		/**
		 * CREATE TABLE `saleplandetial` (
			  `spId` varchar(32) NOT NULL COMMENT '���ۼƻ�����',
			  `drugId` varchar(32) NOT NULL COMMENT 'ҩƷ���',
			  `drugName` varchar(32) NOT NULL COMMENT 'ҩƷ����',
			  `amount` int(11) NOT NULL COMMENT '����'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���ۼƻ�����ϸ��'
		 */
	
		private String spId;
		private String drugId;
		private String drugName;
		private String matSpec;
		private String metering;
		private int amount;
		private int soamount; //��Ʒ�ƻ�������
		private int saamount; //��Ʒ����������
		private String rate; //��Ʒ�ƻ�������
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
		public String getRate() {
			return rate;
		}
		public void setRate(String rate) {
			this.rate = rate;
		}
		public int getSoamount() {
			return soamount;
		}
		public void setSoamount(int soamount) {
			this.soamount = soamount;
		}
		public int getSaamount() {
			return saamount;
		}
		public void setSaamount(int saamount) {
			this.saamount = saamount;
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
		@Override
		public String toString() {
			return "Saleplandetial [spId=" + spId + ", drugId=" + drugId + ", drugName=" + drugName + ", amount="
					+ amount + "]";
		}
		
		
		
}
