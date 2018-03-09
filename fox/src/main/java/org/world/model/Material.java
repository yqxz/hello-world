package org.world.model;

public class Material {
	/**
	 * CREATE TABLE `material` (
		  `matId` varchar(32) NOT NULL COMMENT '材料编号',
		  `matName` varchar(32) NOT NULL COMMENT '材料名',
		  `matCategory` varchar(32) NOT NULL COMMENT '材料类别',
		  `matSpec` varchar(32) NOT NULL COMMENT '材料规格',
		  PRIMARY KEY (`matId`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='原材料表';
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
