package org.world.model;

public class Saleoutstore {
	
		/**
		 * CREATE TABLE `saleoutstore` (
			  `sosId` varchar(32) NOT NULL COMMENT '���۳��ⵥ��',
			  `soId` varchar(32) NOT NULL COMMENT '���۶�����',
			  `repName` varchar(32) NOT NULL COMMENT '�ֿ�����',
			  `variety` smallint(6) NOT NULL COMMENT '��������',
			  `totalNumber` int(11) NOT NULL COMMENT '�ϼ�����',
			  `outStoreDate` varchar(32) NOT NULL COMMENT '��������',
			  `userId` varchar(32) NOT NULL COMMENT '����ԱID',
			  `userName` varchar(32) NOT NULL COMMENT '����Ա����',
			  PRIMARY KEY (`sosId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���۳��ⵥ����';

		 */
	
		private String sosId;
		private String soId;
		private String repName;
		private int variety;
		private int totalNumber;
		private String outStoreDate;
		private String userId;
		private String userName;
		public String getSosId() {
			return sosId;
		}
		public void setSosId(String sosId) {
			this.sosId = sosId;
		}
		public String getSoId() {
			return soId;
		}
		public void setSoId(String soId) {
			this.soId = soId;
		}
		public String getRepName() {
			return repName;
		}
		public void setRepName(String repName) {
			this.repName = repName;
		}
		public int getVariety() {
			return variety;
		}
		public void setVariety(int variety) {
			this.variety = variety;
		}
		public int getTotalNumber() {
			return totalNumber;
		}
		public void setTotalNumber(int totalNumber) {
			this.totalNumber = totalNumber;
		}
		public String getOutStoreDate() {
			return outStoreDate;
		}
		public void setOutStoreDate(String outStoreDate) {
			this.outStoreDate = outStoreDate;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		
}
