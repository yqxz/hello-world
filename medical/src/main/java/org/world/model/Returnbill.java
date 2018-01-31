package org.world.model;

public class Returnbill {
		/**
		 * CREATE TABLE `returnbill` (
			  `retId` varchar(32) NOT NULL COMMENT '�˻�����',
			  `variety` smallint(6) NOT NULL COMMENT '�˻�����',
			  `retNumber` int(11) NOT NULL COMMENT '�˻�����',
			  `retDate` varchar(32) NOT NULL COMMENT '�˻�ʱ��',
			  `totalMoney` double NOT NULL COMMENT '�ۼƽ��',
			  `userId` varchar(32) NOT NULL COMMENT '������ID',
			  `userName` varchar(32) NOT NULL COMMENT '����������',
			  PRIMARY KEY (`retId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�˻�������';
		 */
	
		private String retId;
		private int variety;
		private int retNumber;
		private String retDate;
		private double totalMoney;
		private String userId;
		private String userName;
		
		public String getRetId() {
			return retId;
		}
		public void setRetId(String retId) {
			this.retId = retId;
		}
		public int getVariety() {
			return variety;
		}
		public void setVariety(int variety) {
			this.variety = variety;
		}
		public int getRetNumber() {
			return retNumber;
		}
		public void setRetNumber(int retNumber) {
			this.retNumber = retNumber;
		}
		public String getRetDate() {
			return retDate;
		}
		public void setRetDate(String retDate) {
			this.retDate = retDate;
		}
		public double getTotalMoney() {
			return totalMoney;
		}
		public void setTotalMoney(double totalMoney) {
			this.totalMoney = totalMoney;
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
