package org.world.model;

public class ProducingPlan {
	
	private int id;
	private int drugId;
	private String drugName;
	private int count;
	private String startData;
	private String expectData;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDrugId() {
		return drugId;
	}
	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getStartData() {
		return startData;
	}
	public void setStartData(String startData) {
		this.startData = startData;
	}
	public String getExpectData() {
		return expectData;
	}
	public void setExpectData(String expectData) {
		this.expectData = expectData;
	}
	
	
}
