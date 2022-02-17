package OOP_Encapsulation;

public class LoginPage {

	private String userName;
	private String password;
	
	public LoginPage(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
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
	
	public void doLogin(String userName, String password) {
		
		System.out.println("enter username: " + userName);
		System.out.println("enter password: " + password);
		System.out.println("click on login button");
		System.out.println("login is done....");
	}
	
public void doLogin() {
		
		System.out.println("enter username: " + this.userName);
		System.out.println("enter password: " + this.password);
		System.out.println("click on login button");
		System.out.println("login is done....");
	}
}
