package Array;

public class FindIndex {
	public static void main(String[]args) {
		int[] arr = {8,6,5,4,3,2,9};
		int num = 3;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num)System.out.println(i);
		}
	}
}
