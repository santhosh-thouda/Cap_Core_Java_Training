package Array;

public class RotateRightByOne {
	public static void main(String[]args) {
		int[] arr = {8,6,5,4,3,2,9};
		int lastVal = arr[arr.length-1];
		
		for(int i = arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[0] = lastVal;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
