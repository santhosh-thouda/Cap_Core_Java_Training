package Loops;

public class Loops {
	public static void main(String[]args) {
		int n = 5;
		
		//for loop
		int sum = 0;
		for(int i = 0; i<=n; i++) {
			sum = sum + i;
		}
		
		//while loop
		int sum1 = 0;
		int i = 0;
		while(i <= n) {
			sum1 = sum1 + i;
			i++;
		}
		
		//do while loop
		int sum2 = 0;
		int j = 0;
		do{
			sum2 = sum2 + j;
		}while(j<=n);
	}
}
