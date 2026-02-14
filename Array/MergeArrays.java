package Array;

public class MergeArrays {
	public static void main(String[]args) {
		int[] arr1 = {4,5,6,7};
		int[] arr2 = {9,8,7,6};
		
		int n = arr1.length + arr2.length;
		int[] temp = new int[n];
		int k = 0;
		
		for(int i = 0; i<arr1.length; i++) {
			temp[k] = arr1[i];
			k++;
		}
		
		for(int i = 0; i<arr2.length; i++) {
			temp[k] = arr2[i];
			k++;
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println(temp[i]);
		}
	}
}
