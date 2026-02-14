package Practice;

public class NeonNumber {
	// the sum of digits of its square equals the number.
	static int sumOfDigits(int square) {
		int sum = 0;
		int temp = square;
		while(temp > 0) {
			int ld = temp % 10;
			sum += ld;
			temp = temp / 10;
		}
		return sum;
	}
	public static void main(String[]args) {
		int n = 9;
		int square = n*n;
		System.out.println(sumOfDigits(square) == n ? "Yes it is a Neon Number" : "No it is not a Neon Number ");
	}
}
