package Loops;

public class SumOfOddNumbers {
	public static void main(String[]args) {
		int sum = 0, n = 18;
		
		for(int i = 0; i<=n; i++) {
			if(i%2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
