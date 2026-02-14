package Array;

public class ElectricityUnits {
	public static void main(String[]args) {
		int[] units = {97,32,81,29,74,25,92,64,34,12};
		int sum = 0;
		for(int i = 0; i<units.length; i++) {
			sum += units[i];
		}
		System.out.println(sum);
	}
}
