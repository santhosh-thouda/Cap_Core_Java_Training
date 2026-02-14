package Array;

public class MaxOfSecondHalf {
	static int maxi(int arr[]) {
		int mid = (arr.length)/2;
		int max = arr[mid];
		for(int i = mid; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {19,2,389,33,45,12,87,345,34,967,123,53};
		System.out.println(maxi(arr));
	}
}
