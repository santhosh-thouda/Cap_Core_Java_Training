package Array;

public class ElementExistOrNot {
	static boolean exists(int arr[], int num) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num)return true;
		}
		return false;
	}
	
	public static void main(String[]args) {
		int[] arr = {34,654,63,983, 8383, 362, 283, 486, 902, 108, 307};
		int num = 654;
		System.out.println(exists(arr, num));
	}
}