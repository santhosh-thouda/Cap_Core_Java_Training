package Loops;

public class SumOfEvenNumbers {
	public static void main(String[]args) {
		int sum = 0, n = 20;
		for(int i = 0; i<=n; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
