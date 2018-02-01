package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Purchase implements Serializable{
		/**
		 * CREATE TABLE `purchase` (
			  `purId` varchar(32) NOT NULL COMMENT '�ɹ�����',
			  `userId` varchar(32) NOT NULL COMMENT 'ְ����',
			  `userName` varchar(32) NOT NULL COMMENT 'ְ������',
			  `supName` varchar(32) NOT NULL COMMENT '��Ӧ������',
			  `purTime` varchar(32) NOT NULL COMMENT '�ɹ�ʱ��',
			  `variety` smallint(6) NOT NULL COMMENT 'Ʒ������',
			  `totalNumber` int(11) NOT NULL COMMENT '��������',
			  `totalMoney` double NOT NULL COMMENT '�ϼƽ��',
			  PRIMARY KEY (`purId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�ɹ���������';
		 */
		private String purId;
		private String userId;
		private String userName;
		private String supName;
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
		public String getSupName() {
			return supName;
		}
		public void setSupName(String supName) {
			this.supName = supName;
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
		
		
		
		
}
