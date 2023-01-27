package model.member;

public class MemberVO {
	
	private int mnum; //pk
	private String userID; //ID
	private String userPW; //PW
	private String userName; // NAME
	
	// [getter, setter]
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
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
	
	//toString 오버라이딩
	@Override
	public String toString() {
		return "MemberVO [mnum=" + mnum + ", userID=" + userID + ", userPW=" + userPW + ", userName=" + userName + "]";
	}
	
	
	
}
