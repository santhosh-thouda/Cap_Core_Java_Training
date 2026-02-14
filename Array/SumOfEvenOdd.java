package Array;

public class SumOfEvenOdd {
	public static void main(String[]args) {
		int[] arr = {34,654,63,983, 8383, 362, 283, 486, 902, 108, 307};
		
		//sum of even and odd elements
		int evenSum = 0, oddSum = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] %2 == 0) {
				evenSum += arr[i];
			}
			else {
				oddSum += arr[i];
			}
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}
