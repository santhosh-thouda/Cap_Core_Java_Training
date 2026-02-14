package ExceptionHandlingPractice;

public class OnlineLoginSystem {
	public static void login(String username, String password) {
		if(username == null) {
			throw new NullPointerException("User name is null");
		}
		if(password == null || password.isEmpty()) {
			throw new IllegalArgumentException("Password shouldn't be empty");
		}
		System.out.println("Login Successful");
	}
	
	public static void main(String[] args) {
		try {
			login(null, "user123");
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
