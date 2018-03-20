package org.world.model;

public class SalePlan {

		private String spId;
		private int variety;
		private int totalNumber;
		private int userId;
		private String loginName;
		private String beginDate;
		private String endDate;
		private double totalMoney;

		public double getTotalMoney() {
			return totalMoney;
		}
		public void setTotalMoney(double totalMoney) {
			this.totalMoney = totalMoney;
		}

		public String getSpId() {
			return spId;
		}
		public void setSpId(String spId) {
			this.spId = spId;
		}
		public int getVariety() {
			return variety;
		}
		public void setVariety(int variety) {
			this.variety = variety;
		}
		public int getTotalNumber() {
			return totalNumber;
		}
		public void setTotalNumber(int totalNumber) {
			this.totalNumber = totalNumber;
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
		public String getBeginDate() {
			return beginDate;
		}
		public void setBeginDate(String beginDate) {
			this.beginDate = beginDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		@Override
		public String toString() {
			return "SalePlan [spId=" + spId + ", variety=" + variety + ", totalNumber=" + totalNumber + ", userId="
					+ userId + ", loginName=" + loginName + ", beginDate=" + beginDate + ", endDate=" + endDate
					+ ", totalMoney=" + totalMoney + "]";
		}





}
