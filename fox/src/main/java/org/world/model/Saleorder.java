package org.world.model;

public class Saleorder {
		/**
		 * CREATE TABLE `saleorder` (
			  `soId` varchar(32) NOT NULL COMMENT '销售订单编号',
			  `totalNumber` int(11) NOT NULL COMMENT '销售总数',
			  `totalMoney` double NOT NULL COMMENT '总金额',
			  `deposit` double NOT NULL COMMENT '已付金额',
			  `cusId` varchar(32) NOT NULL COMMENT '客户ID',
			  `cusName` varchar(32) NOT NULL COMMENT '客户姓名',
			  `createDate` varchar(32) NOT NULL COMMENT '制单日期',
			  `userId` varchar(32) NOT NULL COMMENT '销售员ID',
			  `userName` varchar(32) NOT NULL COMMENT '销售员姓名',
			  `state` tinyint(1) NOT NULL DEFAULT '0' COMMENT '完成度',
			  PRIMARY KEY (`soId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售订单主表'
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

		@Override
		public String toString() {
			return "Saleorder [soId=" + soId + ", totalNumber=" + totalNumber + ", totalMoney=" + totalMoney
					+ ", deposit=" + deposit + ", cusId=" + cusId + ", cudName=" + cudName + ", creatDate=" + creatDate
					+ ", userId=" + userId + ", userName=" + userName + ", state=" + state + "]";
		}

}
