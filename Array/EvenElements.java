package Array;

public class EvenElements {
	public static void main(String[]args) {
		int[] arr = {23, 56, 35, 98, 100, 312};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
