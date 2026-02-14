package Loops;

import java.util.Scanner;

public class AtmPin {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int pin = 2092;
		int n;
		do {
			System.out.println("Enter pin: ");
			n = sc.nextInt();
			if(n != pin)System.out.println("PIN Entered Inorrectly");
		}while(n != pin);
		
		System.out.println("PIN entered correctly. Access granted.");
	}
}
