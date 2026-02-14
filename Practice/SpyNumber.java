package Practice;

public class SpyNumber {
	// product of digits of no = sum of digits of num
	static int sum(int n) {
		int sum = 0;
		while(n > 0) {
			int ld = n % 10;
			sum += ld;
			n = n / 10;
		}
		return sum;
	}
	
	static int product(int n) {
		int product = 1;
		while(n > 0) {
			int ld = n % 10;
			product *= ld;
			n = n / 10;
		}
		return product;
	}
	
	public static void main(String[] args) {
		int n = 1124;
		System.out.println(sum(n) == product(n) ? "Yes it is a Spy Number" : "No it is not a Spy Number");
	}
}
