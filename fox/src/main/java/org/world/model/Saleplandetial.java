package org.world.model;

public class Saleplandetial {
		
		private int spId;
		private String drugId;
		private String drugName;
		private double unitPrice;
		private int amount;
		private int outAmount; //��Ʒ����������
		private String rate; //��Ʒ�ƻ�������
		
		public int getSpId() {
			return spId;
		}
		public void setSpId(int spId) {
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
		public int getOutAmount() {
			return outAmount;
		}
		public void setOutAmount(int outAmount) {
			this.outAmount = outAmount;
		}
		
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		@Override
		public String toString() {
			return "Saleplandetial [spId=" + spId + ", drugId=" + drugId + ", drugName=" + drugName + ", unitPrice="
					+ unitPrice + ", amount=" + amount + ", outAmount=" + outAmount + ", rate=" + rate + "]";
		}
		
	
		
		
		
}
