package Array;

public class AverageOfElements {
	public static void main(String[]args) {
		int sum = 0;
		int[] arr = {34,654,63,983, 8383, 362, 283, 486, 902, 108, 307};
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum/arr.length);
	}
}
