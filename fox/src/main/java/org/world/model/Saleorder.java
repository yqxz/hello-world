package org.world.model;

public class Saleorder {

		private String  soId;
		private String cusId;
		private String cusName;
		private int userId;
		private String loginName;
		private String creatDate;
		private int totalNumber;//总数
		private int OutTotal;//总发货
		private String  state;
		public String getSoId() {
			return soId;
		}
		public void setSoId(String soId) {
			this.soId = soId;
		}
		public String getCusId() {
			return cusId;
		}
		public void setCusId(String cusId) {
			this.cusId = cusId;
		}

		public String getCusName() {
			return cusName;
		}
		public void setCusName(String cusName) {
			this.cusName = cusName;
		}

		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getLoginName() {
			return loginName;
		}
		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}
		public String getCreatDate() {
			return creatDate;
		}
		public void setCreatDate(String creatDate) {
			this.creatDate = creatDate;
		}

		public int getTotalNumber() {
			return totalNumber;
		}
		public void setTotalNumber(int totalNumber) {
			this.totalNumber = totalNumber;
		}
		public int getOutTotal() {
			return OutTotal;
		}
		public void setOutTotal(int outTotal) {
			OutTotal = outTotal;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		@Override
		public String toString() {
			return "Saleorder [soId=" + soId + ", cusId=" + cusId + ", cusName=" + cusName + ", userId=" + userId
					+ ", loginName=" + loginName + ", creatDate=" + creatDate + ", totalNumber=" + totalNumber
					+ ", OutTotal=" + OutTotal + ", state=" + state + "]";
		}


}
