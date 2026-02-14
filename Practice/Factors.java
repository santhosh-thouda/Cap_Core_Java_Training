package Practice;

public class Factors {
	static void factors(int n) {
		for(int i = 1; i<=n; i++) {
			if(n%i == 0)System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	static int factorsSum(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	static int factorsProduct(int n) {
		int product = 1;
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				product *= i;
			}
		}
		return product;
	}
	
	public static void main(String[]args) {
		int num = 36;
		System.out.print("Factors: ");
		factors(num);
		System.out.println("Sum: " + factorsSum(num));
		System.out.println("Product: " + factorsProduct(num));
	}
}
