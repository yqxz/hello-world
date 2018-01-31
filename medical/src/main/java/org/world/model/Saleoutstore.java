package org.world.model;

public class Saleoutstore {
		/**
		 * CREATE TABLE `saleoutstore` (
			  `sosId` varchar(32) NOT NULL COMMENT '销售出库单号',
			  `soId` varchar(32) NOT NULL COMMENT '销售订单号',
			  `repName` varchar(32) NOT NULL COMMENT '仓库名称',
			  `variety` smallint(6) NOT NULL COMMENT '种类数量',
			  `totalNumber` int(11) NOT NULL COMMENT '合计总数',
			  `outStoreDate` varchar(32) NOT NULL COMMENT '出库日期',
			  `userId` varchar(32) NOT NULL COMMENT '管理员ID',
			  `userName` varchar(32) NOT NULL COMMENT '管理员姓名',
			  PRIMARY KEY (`sosId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='销售出库单主表';

		 */
	
		private String sosId;
		private String soId;
		private String repName;
		private int variety;
		private int totalNumber;
		private String outStoreDate;
		private String userId;
		private String userName;
		public String getSosId() {
			return sosId;
		}
		public void setSosId(String sosId) {
			this.sosId = sosId;
		}
		public String getSoId() {
			return soId;
		}
		public void setSoId(String soId) {
			this.soId = soId;
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
		public String getOutStoreDate() {
			return outStoreDate;
		}
		public void setOutStoreDate(String outStoreDate) {
			this.outStoreDate = outStoreDate;
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
