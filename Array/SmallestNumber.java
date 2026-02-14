package Array;

public class SmallestNumber {
	public static void main(String[]args) {
		int[] arr = {34,654,63,983, 8383, 362};
		int smallest = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println(smallest);
	}
}
