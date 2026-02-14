package Array;

public class HighestSalary {
	public static void main(String[]args) {
		int[] salaries = {10000, 15000, 75000, 200000, 47000, 82000, 91000, 68000};
		int highest = salaries[0];
		for(int i = 1; i<salaries.length; i++) {
			if(highest < salaries[i]) {
				highest = salaries[i];
			}
		}
		System.out.println(highest);
	}
}
