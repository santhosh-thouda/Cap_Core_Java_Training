package Methods;

import java.util.Scanner;

public class SquareOfNumber {
	static int findSquare(int n) {
		return n*n;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println(findSquare(n));
	}
}
