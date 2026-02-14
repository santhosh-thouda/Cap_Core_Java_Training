package Operators;

public class LoginValidation {
	public static void main(String[]args) {
		boolean userName = true;
		boolean password = true;
		boolean otpVerified = true;
		
		boolean loginSecured = (userName && password && otpVerified);
		System.out.println(loginSecured ? "Login Success" : "Login Failed");
	}
}