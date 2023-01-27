package model.Ordermember;

public class OrderMemberVO {
		private int onum; // PK
		private String userID; // ID
		private String userPW; // PW
		private String userName; // NAME
		
		
		public int getOnum() {
			return onum;
		}
		public void setOnum(int onum) {
			this.onum = onum;
		}
		public String getUserID() {
			return userID;
		}
		public void setUserID(String userID) {
			this.userID = userID;
		}
		public String getUserPW() {
			return userPW;
		}
		public void setUserPW(String userPW) {
			this.userPW = userPW;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		@Override
		public String toString() {
			return "OrderMemberVO [onum=" + onum + ", userID=" + userID + ", userPW=" + userPW + ", userName="
					+ userName + "]";
		}

		
		

}
