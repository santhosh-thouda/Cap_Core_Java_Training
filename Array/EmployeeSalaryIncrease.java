package Array;

public class EmployeeSalaryIncrease {
	public static void main(String[]args) {
		int[] salary = {15000,48000,34000,29000,100000, 82000};
		for(int i = 0; i<salary.length; i++) {
			int increase = salary[i]/100*10;
			salary[i] = salary[i] + increase;
			System.out.println(salary[i]);
		}
	}
}
