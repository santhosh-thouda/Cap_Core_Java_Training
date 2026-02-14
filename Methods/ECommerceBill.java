package Methods;

public class ECommerceBill {
	static int billAmount(int product, int price) {
		int totalBill = product*price;
		return totalBill;
	}
	
	public static void main(String[]args) {
		System.out.println(billAmount(1, 999));
		System.out.println(billAmount(2, 999));
	}
}
