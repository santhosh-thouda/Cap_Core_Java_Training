package Array;

public class AverageOfFirstHalf {
	static int average(int arr[]) {
		int avg = 0;
		int mid = (arr.length)/2;
		int sum = 0;
		for(int i = 0; i<mid; i++) {
			sum += arr[i];
		}
		avg = sum/mid;
		
		return avg;
	}
	public static void main(String[]args) {
		int[] arr = {19,2,389,33,45,12,87,345,34,967,123,53};
		System.out.println(average(arr));
	}
}
