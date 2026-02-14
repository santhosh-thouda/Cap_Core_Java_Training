package DecisionMaking;

import java.util.Scanner;

public class UserChoosesRole {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Admin 2.Manager 3.User");
		System.out.print("Choose role: ");
		int choose = sc.nextInt();
		
		switch(choose) {
			case 1:
				System.out.println("Role is valid, Password Checked");
				break;
			case 2:
				System.out.println("Role is valid, Password Checked");
				break;
			case 3:
				System.out.println("Role is valid, Password Checked");
				break;
			default:
				System.out.println("Role is invalid, Password Unchecked");
				break;
		}
	}
}
