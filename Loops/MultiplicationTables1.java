package Loops;

public class MultiplicationTables1 {
	// 3 to 5 tables each upto 10
	public static void main(String[]args) {
		
		int n;
		for(n = 3; n<=5; n++) {
			for(int i = 1; i<=10; i++) {
				if(i == 1)System.out.println("Multiplication table of "+n);
				System.out.println(n + " * " + i + " = " +(n*i));
			}
			System.out.println();
		}
	}
}

