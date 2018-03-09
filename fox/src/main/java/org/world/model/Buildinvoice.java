package org.world.model;

public class Buildinvoice {
		/**
		 * CREATE TABLE `buildinvoice` (
			  `buId` varchar(32) NOT NULL COMMENT '发票生成单ID',
			  `soId` varchar(32) NOT NULL COMMENT '销售订单号',
			  `buMoney` double NOT NULL COMMENT '金额',
			  `userId` varchar(32) NOT NULL COMMENT '申请人ID',
			  `userName` varchar(32) NOT NULL COMMENT '申请人姓名',
			  `buDate` varchar(32) NOT NULL COMMENT '申请日期',
			  PRIMARY KEY (`buId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='生成发票单';
		 */
	
		private String buId;
		private String soId;
		private double buMoney;
		private String userId;
		private String uesrName;
		private String buDate;
		public String getBuId() {
			return buId;
		}
		public void setBuId(String buId) {
			this.buId = buId;
		}
		public String getSoId() {
			return soId;
		}
		public void setSoId(String soId) {
			this.soId = soId;
		}
		public double getBuMoney() {
			return buMoney;
		}
		public void setBuMoney(double buMoney) {
			this.buMoney = buMoney;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUesrName() {
			return uesrName;
		}
		public void setUesrName(String uesrName) {
			this.uesrName = uesrName;
		}
		public String getBuDate() {
			return buDate;
		}
		public void setBuDate(String buDate) {
			this.buDate = buDate;
		}
		
		
}
