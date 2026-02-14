package Array;

public class MaxOfOddIndexed {
	//maximum value of odd indexed number
	static int min(int arr[]) {
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max && i%2!=0) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[]args) {
		int[] arr = {19,2,389,33,45,12,87,345,34,967,123,53};
		System.out.println(min(arr));
	}
}
