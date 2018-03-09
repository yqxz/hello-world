package org.world.model;

public class SalePlan {
		/**
		 * CREATE TABLE `saleplan` (
			  `spId` varchar(32) NOT NULL COMMENT '���ۼƻ�����',
			  `variety` smallint(6) NOT NULL COMMENT '��������',
			  `totalNumber` int(11) NOT NULL COMMENT '�����ܶ�',
			  `userId` varchar(32) NOT NULL COMMENT '�Ƶ���ID',
			  `userName` varchar(32) NOT NULL COMMENT '�Ƶ�������',
			  `beginDate` varchar(32) NOT NULL COMMENT '��ʼ����',
			  `endDate` varchar(32) NOT NULL COMMENT '��ֹ����',
			  PRIMARY KEY (`spId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���ۼƻ�����';
		 */
	
		private String spId;
		private int variety;
		private int totalNumber;
		private String userId;
		private String userName;
		private String beginDate;
		private String endDate;
		public String getSpId() {
			return spId;
		}
		public void setSpId(String spId) {
			this.spId = spId;
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
		public String getBeginDate() {
			return beginDate;
		}
		public void setBeginDate(String beginDate) {
			this.beginDate = beginDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		@Override
		public String toString() {
			return "SalePlan [spId=" + spId + ", variety=" + variety + ", totalNumber=" + totalNumber + ", userId="
					+ userId + ", userName=" + userName + ", beginDate=" + beginDate + ", endDate=" + endDate + "]";
		}
		
		
}
