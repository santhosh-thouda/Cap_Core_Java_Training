package DecisionMaking;

import java.util.Scanner;

public class VowelConsonent {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'A') {
			System.out.println("Vowel");
		}
		else if(ch == 'e' || ch == 'e') {
			System.out.println("Vowel");
		}
		else if(ch == 'i' || ch == 'I') {
			System.out.println("Vowel");
		}
		else if(ch == 'o' || ch == 'O') {
			System.out.println("Vowel");
		}
		else if(ch == 'u' || ch == 'U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonent");
		}
	}
}
