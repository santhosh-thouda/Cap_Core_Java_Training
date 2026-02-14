package Array;

public class MinOfEvenIndexed {
	//minimum value of even indexed number
	static int min(int arr[]) {
		int min = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] < min && i%2==0) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[]args) {
		int[] arr = {19,2,389,33,45,12,87,345,34,967,123,53};
		System.out.println(min(arr));
	}
}
