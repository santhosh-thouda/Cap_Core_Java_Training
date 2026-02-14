package Operators;

public class StoreDiscount {
	//4th question
	public static void main(String[]args) {
		int bill = 2500;
		boolean premium = false;
		boolean firstTime = true;
		
		boolean discount = (bill > 2000 && premium) || firstTime;
		
		bill -= discount ? 500 : 0;
		System.out.println(discount ? "Discount Applied" : "No Discount");
		System.out.println(bill);
	}
}
