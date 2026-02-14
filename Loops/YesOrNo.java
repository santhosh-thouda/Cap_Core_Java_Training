package Loops;

import java.util.Scanner;

public class YesOrNo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			System.out.println("Welcome");
			System.out.println("Do you want this alert again?");
			choice = sc.next().charAt(0);
		}while(choice == 'y' || choice == 'Y');
	}
}
