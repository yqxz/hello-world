package org.world.model;

public class Acceptdetial {
		/**
		 * CREATE TABLE `acceptdetial` (
			  `accId` varchar(32) NOT NULL COMMENT '��������',
			  `purId` varchar(32) NOT NULL COMMENT '�ɹ�����',
			  `matId` varchar(32) NOT NULL COMMENT '���ϱ��',
			  `matName` varchar(32) NOT NULL COMMENT '��������',
			  `proDate` varchar(32) NOT NULL COMMENT '��������',
			  `valDate` varchar(32) NOT NULL COMMENT '��Ч����',
			  `accNumber` int(11) NOT NULL COMMENT '����',
			  `supName` varchar(32) NOT NULL COMMENT '��Ӧ������'
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�ɹ���������ϸ��';
		 */
	
		private String accId;
		private String purId;
		private String matId;
		private String matName;
		private String proDate;
		private String valDate;
		private int accNumber;
		private String supName;
		
		
		public String getAccId() {
			return accId;
		}
		public void setAccId(String accId) {
			this.accId = accId;
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
		public String getMatName() {
			return matName;
		}
		public void setMatName(String matName) {
			this.matName = matName;
		}
		public String getProDate() {
			return proDate;
		}
		public void setProDate(String proDate) {
			this.proDate = proDate;
		}
		public String getValDate() {
			return valDate;
		}
		public void setValDate(String valDate) {
			this.valDate = valDate;
		}
		public int getAccNumber() {
			return accNumber;
		}
		public void setAccNumber(int accNumber) {
			this.accNumber = accNumber;
		}
		public String getSupName() {
			return supName;
		}
		public void setSupName(String supName) {
			this.supName = supName;
		}
		
		
}
