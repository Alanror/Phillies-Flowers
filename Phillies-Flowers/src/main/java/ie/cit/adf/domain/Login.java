package ie.cit.adf.domain;

public class Login {
	
	private String userName;
	private String password;
	
	public Login(){}
	
	public Login(String userName, String passWord) {
		this.userName = userName;
		this.password = passWord;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
