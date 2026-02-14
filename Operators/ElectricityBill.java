package Operators;

public class ElectricityBill {
	public static void main(String[]args) {
		int units = 350;
		boolean commercial = false;
		double bill = 0;
		bill += (units > 300 || commercial) ? units * 8 : units * 5;
		bill *= bill * 0.1;
		
		System.out.println(bill);
	}
}
