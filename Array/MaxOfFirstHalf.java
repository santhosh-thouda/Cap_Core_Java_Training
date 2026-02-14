package Array;

public class MaxOfFirstHalf {
	static int maxi(int arr[]) {
		int max = arr[0];
		int mid = (arr.length)/2;
		for(int i = 1; i<mid; i++) {
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
