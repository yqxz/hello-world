package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Paymentapply implements Serializable{
		/**
		 * CREATE TABLE `paymentapply` (
			  `payId` varchar(32) NOT NULL COMMENT '付款申请单号',
			  `invId` varchar(32) NOT NULL COMMENT '发票号',
			  `totalMoney` double NOT NULL COMMENT '金额',
			  `userId` varchar(32) NOT NULL COMMENT '申请人ID',
			  `userName` varchar(32) NOT NULL COMMENT '申请人姓名',
			  `payDate` varchar(32) NOT NULL COMMENT '申请日期',
			  PRIMARY KEY (`payId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='付款申请单';
		 */
	
		private String	payId;
		private String invId;
		private String totalMoney;
		private String userId;
		private String userName;
		private String payDate;
		public String getPayId() {
			return payId;
		}
		public void setPayId(String payId) {
			this.payId = payId;
		}
		public String getInvId() {
			return invId;
		}
		public void setInvId(String invId) {
			this.invId = invId;
		}
		public String getTotalMoney() {
			return totalMoney;
		}
		public void setTotalMoney(String totalMoney) {
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
		public String getPayDate() {
			return payDate;
		}
		public void setPayDate(String payDate) {
			this.payDate = payDate;
		}
		@Override
		public String toString() {
			return "Paymentapply [payId=" + payId + ", invId=" + invId + ", totalMoney=" + totalMoney + ", userId="
					+ userId + ", userName=" + userName + ", payDate=" + payDate + "]";
		}
		
}
