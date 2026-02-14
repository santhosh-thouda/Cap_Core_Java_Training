package Practice;

public class CompositeNumber {
	// the values which are not prime are the composite numbers except 0 and 1 they're neither prime or composite
	static boolean isComposite(int n) {
		if(n <= 1)return true;
		for(int i = 2; i*i<=n; i++) {
			if(n%i == 0)return true;
		}
		return false;
	}
	
	public static void main(String[]args) {
		int n = 19;
		System.out.println(isComposite(n));
	}
}
