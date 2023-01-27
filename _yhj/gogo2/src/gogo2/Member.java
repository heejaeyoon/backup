package gogo2;

public class User {
	private String id;
	private String password;
	private String nickname;
	private String point;

	User() {
	} // 기본 생성자

	User(String id, String password, String nickname, String point) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.point = point;
	}

//각 필드의 Getter, Setter
	void setId(String id) {
		this.id = id;
	}

	void setPassword(String password) {
		this.password = password;
	}

	void setNickname(String nickname) {
		this.nickname = nickname;
	}

	void setpoint(String point) {
		this.point = point;
	}

	String getId() {
		return id;
	}

	String getPassword() {
		return password;
	}

	String getNickname() {
		return nickname;
	}

	String getPoint() { return point;}

}
