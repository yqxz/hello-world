package org.world.model;

public class Saleorder {
		/**
		 * CREATE TABLE `saleorder` (
			  `soId` varchar(32) NOT NULL COMMENT '���۶������',
			  `totalNumber` int(11) NOT NULL COMMENT '��������',
			  `totalMoney` double NOT NULL COMMENT '�ܽ��',
			  `deposit` double NOT NULL COMMENT '�Ѹ����',
			  `cusId` varchar(32) NOT NULL COMMENT '�ͻ�ID',
			  `cusName` varchar(32) NOT NULL COMMENT '�ͻ�����',
			  `createDate` varchar(32) NOT NULL COMMENT '�Ƶ�����',
			  `userId` varchar(32) NOT NULL COMMENT '����ԱID',
			  `userName` varchar(32) NOT NULL COMMENT '����Ա����',
			  `state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '��ɶ�',
			  PRIMARY KEY (`soId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���۶�������'
		 */
	
		private String  soId;
		private int totalNumber;
		private double totalMoney;
		private double deposit;
		private String cusId;
		private String cudName;
		private String creatDate;
		private String userId;
		private String userName;
		private boolean state;
		public String getSoId() {
			return soId;
		}
		public void setSoId(String soId) {
			this.soId = soId;
		}
		public int getTotalNumber() {
			return totalNumber;
		}
		public void setTotalNumber(int totalNumber) {
			this.totalNumber = totalNumber;
		}
		public double getTotalMoney() {
			return totalMoney;
		}
		public void setTotalMoney(double totalMoney) {
			this.totalMoney = totalMoney;
		}
		public double getDeposit() {
			return deposit;
		}
		public void setDeposit(double deposit) {
			this.deposit = deposit;
		}
		public String getCusId() {
			return cusId;
		}
		public void setCusId(String cusId) {
			this.cusId = cusId;
		}
		public String getCudName() {
			return cudName;
		}
		public void setCudName(String cudName) {
			this.cudName = cudName;
		}
		public String getCreatDate() {
			return creatDate;
		}
		public void setCreatDate(String creatDate) {
			this.creatDate = creatDate;
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
		public boolean isState() {
			return state;
		}
		public void setState(boolean state) {
			this.state = state;
		}
		
		
		
}
