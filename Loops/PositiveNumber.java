package Loops;

import java.util.Scanner;

public class PositiveNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Enter number: ");
			n = sc.nextInt();
			if(n < 0)System.out.println("Please enter posive number");
		}while(n < 0);
		
		System.out.println("Positive number: " + n);
	}
}
