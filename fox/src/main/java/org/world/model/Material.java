package org.world.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Material implements Serializable{

	private int matId;
	private String matName;
	private String matCategory;
	private String matSpec;
	
	public int getMatId() {
		return matId;
	}
	public void setMatId(int matId) {
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
	@Override
	public String toString() {
		return "Material [matId=" + matId + ", matName=" + matName + ", matCategory=" + matCategory + ", matSpec="
				+ matSpec + "]";
	}
	
	
}
