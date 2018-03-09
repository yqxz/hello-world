package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class InStore implements Serializable{
		/**
		 * CREATE TABLE `instore` (
			  `inStoreId` varchar(32) NOT NULL COMMENT '��ⵥID',
			  `repName` varchar(32) NOT NULL COMMENT '�ֿ�����',
			  `variety` smallint(6) NOT NULL COMMENT 'Ʒ������',
			  `totalNumber` int(11) NOT NULL COMMENT '��������',
			  `inStoreDate` varchar(32) NOT NULL COMMENT '�������',
			  `userId` varchar(32) NOT NULL COMMENT 'ְ��ID',
			  `userName` varchar(32) NOT NULL COMMENT 'ְ������',
			  `totalMoney` double NOT NULL COMMENT '�ϼƽ��',
			  PRIMARY KEY (`inStoreId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ⵥ����';
		 */
	
		private String inStoreId;
		private String repName;
		private int variety;
		private int totalNumber;
		private String inStoreDate;
		private String userId;
		private String userName;
		private double totalMoney;
		public String getInStoreId() {
			return inStoreId;
		}
		public void setInStoreId(String inStoreId) {
			this.inStoreId = inStoreId;
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
		public String getInStoreDate() {
			return inStoreDate;
		}
		public void setInStoreDate(String inStoreDate) {
			this.inStoreDate = inStoreDate;
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
		public double getTotalMoney() {
			return totalMoney;
		}
		public void setTotalMoney(double totalMoney) {
			this.totalMoney = totalMoney;
		}
		@Override
		public String toString() {
			return "InStore [inStoreId=" + inStoreId + ", repName=" + repName + ", variety=" + variety
					+ ", totalNumber=" + totalNumber + ", inStoreDate=" + inStoreDate + ", userId=" + userId
					+ ", userName=" + userName + ", totalMoney=" + totalMoney + "]";
		}
		
		
		
}
