package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class InStore implements Serializable{
		/**
		 * CREATE TABLE `instore` (
			  `inStoreId` varchar(32) NOT NULL COMMENT '入库单ID',
			  `repName` varchar(32) NOT NULL COMMENT '仓库名称',
			  `variety` smallint(6) NOT NULL COMMENT '品种数量',
			  `totalNumber` int(11) NOT NULL COMMENT '货物总数',
			  `inStoreDate` varchar(32) NOT NULL COMMENT '入库日期',
			  `userId` varchar(32) NOT NULL COMMENT '职工ID',
			  `userName` varchar(32) NOT NULL COMMENT '职工姓名',
			  `totalMoney` double NOT NULL COMMENT '合计金额',
			  PRIMARY KEY (`inStoreId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='入库单主表';
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
