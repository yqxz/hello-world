package org.world.model;

public class Saleorderdetial {

		private String soId;
		private int drugId;
		private String drugName;
		private String metering;
		private int number;
		private int outNumber;//已发货数量
		private double unitPrice;
		public String getSoId() {
			return soId;
		}
		public void setSoId(String soId) {
			this.soId = soId;
		}
		
		public int getDrugId() {
			return drugId;
		}
		public void setDrugId(int drugId) {
			this.drugId = drugId;
		}
		public String getDrugName() {
			return drugName;
		}
		public void setDrugName(String drugName) {
			this.drugName = drugName;
		}
		public String getMetering() {
			return metering;
		}
		public void setMetering(String metering) {
			this.metering = metering;
		}

		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public int getOutNumber() {
			return outNumber;
		}
		public void setOutNumber(int outNumber) {
			this.outNumber = outNumber;
		}
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		@Override
		public String toString() {
			return "Saleorderdetial [soId=" + soId + ", drugId=" + drugId + ", drugName=" + drugName + ", metering="
					+ metering + ",  number=" + number + ", outNumber=" + outNumber + ", unitPrice="
					+ unitPrice + "]";
		}





}
