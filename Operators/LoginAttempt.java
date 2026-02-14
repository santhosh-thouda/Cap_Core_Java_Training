package Operators;

public class LoginAttempt {
	public static void main(String[]args) {
		int attempts = 2;
		boolean correct = false;
		
		attempts += correct ? 0 : 1;
		boolean locked = attempts >= 3;
		System.out.println(locked ? "Account Locked" : "Account not locked");
	}
}
