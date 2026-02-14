package Loops;

import java.util.Scanner;

public class FiveStudentsMarks {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		for(int i = 1; i<=5; i++) {
			System.out.print("Enter student " + i + " marks: ");
			n = sc.nextInt();
			sum += n;
		}
		System.out.println("Sum of five students marks: "+sum);
	}
}
