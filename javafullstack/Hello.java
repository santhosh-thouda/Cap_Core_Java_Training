package javafullstack;
import java.util.*;

public class Hello {
	static void sum(int a, int b) {
		
	}
	public static void main(String[]args) {
//		System.out.println("Hello World");
//		int var1 = 12;
//		System.out.println(var1);
//		
		Scanner sc = new Scanner(System.in);
		int mainBalance = 2500;
		int deposit = 200;
		int withdraw = 500;
		int transfer = 180;
		int maintainance = 70;
		int deposit1 = 250;

		String select = sc.nextLine();
		
		switch(select) {
			case "m":
				System.out.println(mainBalance);
				break;
			case "d":
				mainBalance += deposit;
				System.out.println(mainBalance);
				break;
			case "w":
				mainBalance -= withdraw;
				System.out.println(mainBalance);
				break;
			case "t":
				mainBalance -= transfer;
				System.out.println(mainBalance);
				break;
			case "ma":
				mainBalance -= maintainance;
				System.out.println(mainBalance);
				break;
			case "d1":
				mainBalance += deposit1;
				System.out.println(mainBalance);
				break;
			default:
				System.out.println(mainBalance);
		}
		
		
		int n1 = 10;
		float n2 = (float)20.2;
		System.out.println(n1+n2);
		
		char c = 'c';
		System.out.println((int)c);
		System.out.println(c);
		
		double n3 = 96.8;
		System.out.println(n3+n2); 
		
		sc.close();
	}
} 