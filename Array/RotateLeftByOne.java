package Array;

public class RotateLeftByOne {
	
	//Rotate an array left by one position.
	public static void main(String[]args) {
		int[] arr = {8,6,5,4,3,2,9};
		int val = arr[0]; 
		for(int i = 0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = val;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
	}
}
