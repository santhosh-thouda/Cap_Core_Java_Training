package Operators;

public class RestaurentBill {
	public static void main(String[]args) {
		int totalBill = 90000;
		int people = 29;
		int gstPercent = 18;
		int gstAmount = totalBill/100 * gstPercent;
		int totalWithoutGst = totalBill - gstAmount;
		System.out.println(gstAmount);
		System.out.println(totalWithoutGst);
		System.out.println(totalBill/people);
	}
}
