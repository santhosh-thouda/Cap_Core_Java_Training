package methodchainingpractice;

public class OnlineShopping {
	private String addItem;
	private String addCoupon;
	
	
	OnlineShopping addItem(String addItem) {
		System.out.println(addItem);
		return this;
	}
	OnlineShopping addCoupon(String addCoupon) {
		System.out.println(addCoupon);
		return this;
	}
	OnlineShopping checkout() {
		System.out.println("checkout successfull");
		return this;
	}
	
	String getItem() {
		return addItem;
	}
	String getCoupon() {
		return addCoupon;
	}
	
	
	public static void main(String[] args) {
		OnlineShopping o = new OnlineShopping()
				.addItem("Laptop").addItem("Mobile").addItem("Earphones").addCoupon("10% off").checkout();
		
	}
}
