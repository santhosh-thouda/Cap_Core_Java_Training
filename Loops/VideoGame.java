package Loops;

import java.util.Scanner;

public class VideoGame {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1. Start Game");
			System.out.println("2. Settings");
			System.out.println("3. Help");
			System.out.println("4. Exit");
			
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			if(choice == 1)System.out.println("Starting Game...");
			else if(choice == 2)System.out.println("Opening Settings...");
			else if(choice == 3)System.out.println("Showing Help...");
			else System.out.println("Exiting...");
		}while(choice != 4);
	}
}
