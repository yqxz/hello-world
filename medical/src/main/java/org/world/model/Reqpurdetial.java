package org.world.model;

public class Reqpurdetial {
		/**
		 * CREATE TABLE `reqpurdetial` (
			  `reqId` varchar(32) NOT NULL COMMENT '�빺��ID',
			  `matId` varchar(32) NOT NULL COMMENT '����ID',
			  `matName` varchar(32) NOT NULL COMMENT '��������',
			  `reqNumber` int(32) NOT NULL COMMENT '�빺����'
			 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�빺����ϸ��';

		 */
	
			private String reqId;
			private String matId;
			private String matName;
			private String reqNumber;
			public String getReqId() {
				return reqId;
			}
			public void setReqId(String reqId) {
				this.reqId = reqId;
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
			public String getReqNumber() {
				return reqNumber;
			}
			public void setReqNumber(String reqNumber) {
				this.reqNumber = reqNumber;
			}
			
}
