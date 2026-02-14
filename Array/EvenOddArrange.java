package Array;

public class EvenOddArrange {
	public static void main(String[]args) {
		int[] arr = {8,6,5,4,3,2,9};
		int k = 0;
		int[] temp = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] %2 == 0) {
				temp[k++] = arr[i];
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 != 0) {
				temp[k++] = arr[i];
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = temp[i];
		}
		
		for(k = 0; k<arr.length; k++) {
			System.out.println(arr[k]);
		} 
	}
}
