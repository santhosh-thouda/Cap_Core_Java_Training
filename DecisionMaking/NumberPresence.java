package DecisionMaking;

import java.util.Scanner;

public class NumberPresence {
	public static void main(String[]args) {
		//for checking the number present between 10 and 20 or not
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 10 && n <= 20)System.out.println("Yes");
		else System.out.println("No");
	}
}
