package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Purchase implements Serializable{
		/**
		 * CREATE TABLE `purchase` (
			  `purId` varchar(32) NOT NULL COMMENT '采购单号',
			  `userId` varchar(32) NOT NULL COMMENT '职工号',
			  `userName` varchar(32) NOT NULL COMMENT '职工姓名',
			  `supId` varchar(32) NOT NULL COMMENT '供应商Id',
			  `purTime` varchar(32) NOT NULL COMMENT '采购时间',
			  `variety` smallint(6) NOT NULL COMMENT '品种数量',
			  `totalNumber` int(11) NOT NULL COMMENT '货物总数',
			  `totalMoney` double NOT NULL COMMENT '合计金额',
			  PRIMARY KEY (`purId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购订单主表';
		 */
		private String purId;
		private String userId;
		private String userName;
		private String supId;
		private String purTime;
		private int variety;
		private int totalNumber;
		private double totalMoney;
		
		
		public String getPurId() {
			return purId;
		}
		public void setPurId(String purId) {
			this.purId = purId;
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
		public String getSupId() {
			return supId;
		}
		public void setSupId(String supId) {
			this.supId = supId;
		}
		public String getPurTime() {
			return purTime;
		}
		public void setPurTime(String purTime) {
			this.purTime = purTime;
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
		public double getTotalMoney() {
			return totalMoney;
		}
		public void setTotalMoney(double totalMoney) {
			this.totalMoney = totalMoney;
		}
		@Override
		public String toString() {
			return "Purchase [purId=" + purId + ", userId=" + userId + ", userName=" + userName + ", supId=" + supId
					+ ", purTime=" + purTime + ", variety=" + variety + ", totalNumber=" + totalNumber + ", totalMoney="
					+ totalMoney + "]";
		}
		
		
		
		
}
