package DecisionMaking;

import java.util.Scanner;

public class DivisibleByBoth {
	public static void main(String[]args) {
		//for checking the given number is divisible by both five and three
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%5 == 0 && n%3 == 0)System.out.println("Yes");
		else System.out.println("No");
	}
}
