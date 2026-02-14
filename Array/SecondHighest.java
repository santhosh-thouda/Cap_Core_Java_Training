package Array;

public class SecondHighest {
	public static void main(String[]args) {
		int[] arr = {4,5,6,7,9,8,7,6};
		int highest = 0;
		int secondHighest = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			}
			else if(arr[i] < highest && arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		System.out.println(secondHighest);
	}
}
