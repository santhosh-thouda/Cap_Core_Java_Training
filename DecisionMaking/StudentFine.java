package DecisionMaking;

import java.util.Scanner;

public class StudentFine {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int attendence = sc.nextInt();
		
		if(attendence < 60) {
			System.out.println("Heavy Fine");
		}
		else if(attendence >= 60 && attendence <= 74)System.out.println("Light Fine");
		else System.out.println("No Fine");
	}
}
