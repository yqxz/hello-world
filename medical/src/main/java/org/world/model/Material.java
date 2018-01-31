package org.world.model;

public class Material {
	/**
	 * CREATE TABLE `material` (
		  `matId` varchar(32) NOT NULL COMMENT '���ϱ��',
		  `matName` varchar(32) NOT NULL COMMENT '������',
		  `matCategory` varchar(32) NOT NULL COMMENT '�������',
		  `matSpec` varchar(32) NOT NULL COMMENT '���Ϲ��',
		  PRIMARY KEY (`matId`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='ԭ���ϱ�';
	 */
	private String matId;
	private String matName;
	private String matCategory;
	private String matSpec;
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
	public String getMatCategory() {
		return matCategory;
	}
	public void setMatCategory(String matCategory) {
		this.matCategory = matCategory;
	}
	public String getMatSpec() {
		return matSpec;
	}
	public void setMatSpec(String matSpec) {
		this.matSpec = matSpec;
	}
	
	
}
