package Array;

public class ArraySum {
	public static void main(String[]args) {
		int[] arr = {46,26, 34, 23, 87};
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
