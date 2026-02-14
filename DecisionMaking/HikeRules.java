package DecisionMaking;

import java.util.Scanner;

public class HikeRules {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rating: ");
		int rating = sc.nextInt();
		
		//using switch case statement
		switch(rating) {
			case 5:
				System.out.println("30% hike");
				break;
			case 4:
				System.out.println("20% hike");
				break;
			case 3:
				System.out.println("10% hike");
				break;
			case 2:
				System.out.println("No hike");
				break;
			case 1:
				System.out.println("No hike");
				break;
			default:
				System.out.println("Error");
				break;
		}
	}
}
