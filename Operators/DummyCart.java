package Operators;

public class DummyCart {
	public static void main(String[]args) {
		int discount = 20;
		int minimumValForDiscount = 3000;
		int price = 4200;
		boolean membership = true;
		
		boolean discountApplied = ((price > minimumValForDiscount) && membership);
		
		int discountMoney = discountApplied ? (price/100*discount) : 0;
		int total = price - discountMoney;
		
		System.out.println(price > minimumValForDiscount ? "Discount Applied and Final Amount: " +(total) : "No Discount Applie and Final Amount: "+(total));
	}
}
