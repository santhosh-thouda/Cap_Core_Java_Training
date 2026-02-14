package Practice;

public class ArmstrongNumber {
	static boolean isArmstrong(int n) {
		int cubes = 0;
		int temp = n;
		
		while(n > 0) {
			int ld = n % 10;
			cubes += ld * ld * ld;
			n = n / 10;
		}
		return cubes == temp;
	}
	public static void main(String[]args) {
		int n = 153;
		System.out.println(isArmstrong(n));
	}
}
