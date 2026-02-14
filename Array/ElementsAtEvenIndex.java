package Array;

public class ElementsAtEvenIndex {
	public static void main(String[]args) {
		int[] arr = {34,654,63,983, 8383, 362, 283, 486, 902, 10288};
		for(int i = 0; i<arr.length; i++) {
			if(i%2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
