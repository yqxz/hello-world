package org.world.model;

public class Salereturn {
	/**
	 * CREATE TABLE `salereturn` (
		  `stId` varchar(32) NOT NULL COMMENT '�����˻�����',
		  `variety` varchar(32) NOT NULL COMMENT '�˻�����',
		  `totalNumber` int(11) NOT NULL COMMENT '�˻�������',
		  `stDate` varchar(32) NOT NULL COMMENT '�˻�ʱ��',
		  `totalMoney` double NOT NULL COMMENT '�˻����',
		  `userId` varchar(32) NOT NULL COMMENT '������ID',
		  `userName` varchar(32) NOT NULL COMMENT '����������',
		  PRIMARY KEY (`stId`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�����˻�������';
	 */
	
		private String stId;
		private String variety;
		private int totalNumber;
		private String stDate;
		private double totalMoney;
		private String userId;
		private String userName;
		public String getStId() {
			return stId;
		}
		public void setStId(String stId) {
			this.stId = stId;
		}
		public String getVariety() {
			return variety;
		}
		public void setVariety(String variety) {
			this.variety = variety;
		}
		public int getTotalNumber() {
			return totalNumber;
		}
		public void setTotalNumber(int totalNumber) {
			this.totalNumber = totalNumber;
		}
		public String getStDate() {
			return stDate;
		}
		public void setStDate(String stDate) {
			this.stDate = stDate;
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
