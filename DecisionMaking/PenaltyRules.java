package DecisionMaking;

import java.util.Scanner;

public class PenaltyRules {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Speed: ");
		int speed = sc.nextInt();
		
		if(speed > 120)System.out.println("License cancelled");
		else if(speed >= 90 && speed <= 120)System.out.println("Heavy Fine");
		if(speed > 60 && speed <= 89)System.out.println("Normal Fine");
		if(speed <= 60)System.out.println("No Fine");
	}
}
