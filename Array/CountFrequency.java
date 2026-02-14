package Array;

public class CountFrequency {
	static int count(int arr[], int num) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num)count++;
		}
		return count;
	}
	public static void main(String[]args) {
		int[] arr = {0,1,2,4,5,2,3,2,3,4};
		int num = 4;
		System.out.println(count(arr,num));
	}
}
