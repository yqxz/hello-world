package org.world.model;

public class Unqualified {
		/**
		 * CREATE TABLE `unqualified` (
			  `unqId` varchar(32) NOT NULL COMMENT '不良品单号',
			  `purId` varchar(32) NOT NULL COMMENT '采购单号',
			  `matId` varchar(32) NOT NULL COMMENT '材料编号',
			  `matName` varchar(32) NOT NULL COMMENT '材料名称',
			  `unqNumber` int(11) NOT NULL COMMENT '数量',
			  `unqDate` varchar(32) NOT NULL COMMENT '出单日期',
			  `userId` varchar(32) NOT NULL COMMENT '质检员编号',
			  `userName` varchar(32) NOT NULL COMMENT '质检员姓名',
			  `supId` varchar(32) NOT NULL COMMENT '供应商ID',
			  `supName` varchar(32) NOT NULL COMMENT '供应商名称',
			  PRIMARY KEY (`unqId`)
			) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='不良品处理单';
		 */
	
		private String unqId;
		private String purId;
		private String matId;
		private String matName;
		private int unqNumber;
		private String unqDate;
		private String userId;
		private String userName;
		private String supId;
		private String supName;
		public String getUnqId() {
			return unqId;
		}
		public void setUnqId(String unqId) {
			this.unqId = unqId;
		}
		public String getPurId() {
			return purId;
		}
		public void setPurId(String purId) {
			this.purId = purId;
		}
		public String getMatId() {
			return matId;
		}
		public void setMatId(String matId) {
			this.matId = matId;
		}
		public String getMatName() {
			return matName;
		}
		public void setMatName(String matName) {
			this.matName = matName;
		}
		public int getUnqNumber() {
			return unqNumber;
		}
		public void setUnqNumber(int unqNumber) {
			this.unqNumber = unqNumber;
		}
		public String getUnqDate() {
			return unqDate;
		}
		public void setUnqDate(String unqDate) {
			this.unqDate = unqDate;
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
		public String getSupName() {
			return supName;
		}
		public void setSupName(String supName) {
			this.supName = supName;
		}
		
		
}
