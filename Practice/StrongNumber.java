package Practice;

public class StrongNumber {
	// sum of digits of n is equal to n
	static int factorial(int n) {
		if(n <= 1)return 1;
		return n * factorial(n-1);
	}
	
	static boolean sumOfFact(int n) {
		int temp = n;
		int sum = 0;
		
		while(temp > 0){
			int ld = temp % 10;
			sum += factorial(ld);
			temp = temp /10;
		}
		return n == sum;
	}
	
	public static void main(String[]args) {
		int n = 145;
		
		if(sumOfFact(n)){
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not a strong number");
		}
	}
}
