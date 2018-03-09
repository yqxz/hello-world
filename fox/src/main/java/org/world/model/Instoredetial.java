package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Instoredetial implements Serializable{
	/**
	 * CREATE TABLE `instoredetial` (
		  `inStoreId` varchar(32) NOT NULL COMMENT '��ⵥ��',
		  `purId` varchar(32) NOT NULL COMMENT '�ɹ�����',
		  `matId` varchar(32) NOT NULL COMMENT 'ԭ�ϱ��',
		  `batchNumber` varchar(32) NOT NULL COMMENT '����',
		  `matName` varchar(32) NOT NULL COMMENT 'ԭ������',
		  `originNumber` varchar(32) NOT NULL COMMENT 'ԭʼ����',
		  `quantity` int(11) NOT NULL COMMENT '����',
		  `amount` double NOT NULL COMMENT '���'
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ⵥ��ϸ��';

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
		@Override
		public String toString() {
			return "Instoredetial [inStoreId=" + inStoreId + ", purId=" + purId + ", matId=" + matId + ", batchNumber="
					+ batchNumber + ", matName=" + matName + ", originNumber=" + originNumber + ", quantity=" + quantity
					+ ", amount=" + amount + "]";
		}
		
		
}
