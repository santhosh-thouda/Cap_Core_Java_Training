package Array;

public class NegativeWithZero {
	public static void main(String[]args) {
		//replace negative numbers with 0
		
		int[] arr = {34,654,63,-983, -8383, 362, -283, 486, -902, 108, -307};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] < 0)arr[i] = 0;
			System.out.print(arr[i]+ " ");
		}
	}
}
