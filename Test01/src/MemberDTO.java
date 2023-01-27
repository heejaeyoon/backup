import java.security.Timestamp;

public class MemberDTO {
	private String username;
	private long id;
	private String email;
	private String phone;
	private String pw;
	private String pwcheck;

	public MemberDTO() {
		
	}
	
	public MemberDTO(long id,String username,String email,String phone,String pw,String pwcheck) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.pw = pw;
		this.pwcheck = pwcheck;

	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPwcheck() {
		return pwcheck;
	}

	public void setPwcheck(String pwcheck) {
		this.pwcheck = pwcheck;
	}

	@Override
	public String toString() {
		return "MemberDTO [username=" + username + ", id=" + id + ", email=" + email + ", phone=" + phone + ", pw=" + pw
				+ ", pwcheck=" + pwcheck + "]";
	}
	
	
	
	
}
