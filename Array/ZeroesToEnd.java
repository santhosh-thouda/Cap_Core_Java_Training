package Array;

public class ZeroesToEnd {
	public static void main(String[]args) {
		int[] arr = {0,1,2,3,0,2,5,0,6};
		int k = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[k++] = arr[i]; 
			}
		}
		for(int i = k; i<arr.length; i++) {
			arr[k++] = 0;
		}
		
		for(k = 0; k<arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}
	}
}
