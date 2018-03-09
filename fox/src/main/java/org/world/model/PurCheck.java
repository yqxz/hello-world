package org.world.model;

import java.io.Serializable;

public class PurCheck implements Serializable{
	private String cheId;        //���鵥��
	private String batchNumber;  //����
	private String matId;        //ԭ���ϱ��
	private String matName;      //ԭ��������
	private String purId;        //�ɹ�����
	private String waterIndex;   //����ˮ������
	private String impurity;     //���ʺ���
	private String cheTime;      // ���ʱ��
	private String grade;        //���ȼ�
	public String getCheId() {
		return cheId;
	}
	public void setCheId(String cheId) {
		this.cheId = cheId;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
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
	public String getPurId() {
		return purId;
	}
	public void setPurId(String purId) {
		this.purId = purId;
	}
	public String getWaterIndex() {
		return waterIndex;
	}
	public void setWaterIndex(String waterIndex) {
		this.waterIndex = waterIndex;
	}
	public String getImpurity() {
		return impurity;
	}
	public void setImpurity(String impurity) {
		this.impurity = impurity;
	}
	public String getCheTime() {
		return cheTime;
	}
	public void setCheTime(String cheTime) {
		this.cheTime = cheTime;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "PurCheck [cheId=" + cheId + ", batchNumber=" + batchNumber + ", matId=" + matId + ", matName=" + matName
				+ ", purId=" + purId + ", waterIndex=" + waterIndex + ", impurity=" + impurity + ", cheTime=" + cheTime
				+ ", grade=" + grade + "]";
	}
	
	
	
	

}
