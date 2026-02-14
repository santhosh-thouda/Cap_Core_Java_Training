package Array;

public class LargestNumber {
	public static void main(String[]args) {
		int[] arr = {34,654,63,983, 8383, 362};
		int largest = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}
}
