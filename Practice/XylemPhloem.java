package Practice;

public class XylemPhloem {
	static void check(int n) {
		int ld = n % 10;
		n = n / 10;
		int sum = ld, sum1 = 0;
		
		while(n > 9) {
			// insead of sum1 += n%10 we can also use int ld = n % 10 and in next step sum += ld
			sum1 += n % 10;
			n = n / 10;
		}
		
		sum += n;
		
		if(sum == sum1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
	public static void main(String[]args) {
		int n = 1256;
		check(n);
	}
}
