package org.world.model;

public class Repertory {
	/**
	 * CREATE TABLE `repertory` (
		  `repId` varchar(32) NOT NULL COMMENT '�ֿ���',
		  `repName` varchar(32) NOT NULL COMMENT '�ֿ�����',
		  `repCategory` varchar(32) NOT NULL COMMENT '�ֿ����',
		  `repCapacity` varchar(32) NOT NULL COMMENT '�ֿ�����',
		  `repInfo` varchar(32) NOT NULL COMMENT '��ע��Ϣ',
		  PRIMARY KEY (`repId`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�ֿ��';
	 */
	
		private String repId;
		private String repName;
		private String repCategory;
		private String repCapacity;
		private String repInfo;
		public String getRepId() {
			return repId;
		}
		public void setRepId(String repId) {
			this.repId = repId;
		}
		public String getRepName() {
			return repName;
		}
		public void setRepName(String repName) {
			this.repName = repName;
		}
		public String getRepCategory() {
			return repCategory;
		}
		public void setRepCategory(String repCategory) {
			this.repCategory = repCategory;
		}
		public String getRepCapacity() {
			return repCapacity;
		}
		public void setRepCapacity(String repCapacity) {
			this.repCapacity = repCapacity;
		}
		public String getRepInfo() {
			return repInfo;
		}
		public void setRepInfo(String repInfo) {
			this.repInfo = repInfo;
		}
		
		
}
