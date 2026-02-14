package Practice;

public class GCD {
	static int gcdNumber(int a, int b) {
		while(a > 0 && b > 0) {
			if(a > b)a = a % b;
			else if(b > a) b = b % a;
			
			if(a == 0) {
				return b;
			}
		}
		return a;
	}
	
	public static void main(String[]args) {
		int n1 = 10;
		int n2 = 18;
		System.out.println(gcdNumber(n1, n2));
	}
}
