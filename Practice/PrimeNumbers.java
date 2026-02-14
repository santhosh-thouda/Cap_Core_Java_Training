package Practice;

public class PrimeNumbers {
	static boolean isPrime(int n) {
		if(n == 0 || n == 1)return false;
		if(n == 2 || n == 3)return true;
		if(n % 2 == 0 || n % 3 == 0)return false;
			
		for(int i = 5; i*i <=n; i+=6) {
			if(n%i == 0 || n%(i+2)==0)return false;
		}
		return true;
	}
	
	static void primeNumbers(int a, int b) {
		for(int i = a; i<=b; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[]args) {
		int n = 20;
		primeNumbers(0, n);
	}
}
