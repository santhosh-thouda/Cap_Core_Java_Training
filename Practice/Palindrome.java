package Practice;

public class Palindrome {
	static boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while(temp > 0) {
			int ld = temp % 10;
			rev = rev * 10 + ld;
			temp = temp/10;
		}
		return num == rev;
	}
	
	public static void main(String[]args) {
		int n = 2032;
		System.out.println(isPalindrome(n));
	}
}
