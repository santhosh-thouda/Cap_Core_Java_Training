package DecisionMaking;

import java.util.Scanner;

public class PasswordChecking {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		
		if(password.length() < 6)System.out.println("Weak");
		else if(password.length() <= 9 && password.length() >= 6)System.out.println("Medium");
		else System.out.println("Strong");
	}
}
