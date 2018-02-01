package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Reqpurchase implements Serializable{
		/**
		 * CREATE TABLE `reqpurchase` (
			  `reqId` varchar(32) NOT NULL COMMENT '�빺����',
			  `variety` smallint(6) NOT NULL COMMENT '��������',
			  `totalNumber` int(11) NOT NULL COMMENT '�빺����',
			  `reqDate` varchar(32) DEFAULT NULL COMMENT '�빺����',
			  `reqType` enum('��ͨ����','�����ɹ�') NOT NULL DEFAULT '��ͨ����' COMMENT '�빺����',
			  `userID` varchar(32) NOT NULL COMMENT '�Ƶ���ID',
			  `userName` varchar(32) NOT NULL COMMENT '�Ƶ�������',
			  `reqState` tinyint(1) NOT NULL DEFAULT '0' COMMENT '�������',
			  PRIMARY KEY (`reqId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�빺������';
		 */
	
		private String	reqId;
		private int variety;
		private int totalNumber;
		private String	reqDate;
		private String	reqType;
		private String	userId;
		private String	userName;
		private boolean reqState;
		public String getReqId() {
			return reqId;
		}
		public void setReqId(String reqId) {
			this.reqId = reqId;
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
		public String getReqDate() {
			return reqDate;
		}
		public void setReqDate(String reqDate) {
			this.reqDate = reqDate;
		}
		public String getReqType() {
			return reqType;
		}
		public void setReqType(String reqType) {
			this.reqType = reqType;
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
		public boolean getReqState() {
			return reqState;
		}
		public void setReqState(boolean reqState) {
			this.reqState = reqState;
		}
		@Override
		public String toString() {
			return "Reqpurchase [reqId=" + reqId + ", variety=" + variety + ", totalNumber=" + totalNumber
					+ ", reqDate=" + reqDate + ", reqType=" + reqType + ", userId=" + userId + ", userName=" + userName
					+ ", reqState=" + reqState + "]";
		}
		
		
}
