package Array;

public class EvenOddCount {
	public static void main(String[]args) {
		int[] arr = {34,654,63,983, 8383, 362, 283, 486, 902, 10288};
		int even = 0;
		int odd = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0)even++;
			else odd++;
		}
		System.out.println("Even: " +even);
		System.out.println("Odd: " +odd);
	}
}
