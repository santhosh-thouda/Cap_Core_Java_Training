package methodchainingpractice;

public class OnlineFood {
	OnlineFood restaurent(String restaurent) {
		System.out.println("Restaurent is " +restaurent);
		return this;
	}
	OnlineFood dish(String dish) {
		System.out.println("Dish is " +dish);
		return this;
	}
	OnlineFood quantity(int quantity) {
		System.out.println("Quantity is " +quantity);
		return this;
	}
	OnlineFood paymentMode(String payment) {
		System.out.println("Payment mode is " +payment);
		return this;
	}
	
	
	public static void main(String[] args) {
		new OnlineFood()
			.restaurent("Paradise")
			.dish("Biryani")
			.quantity(12)
			.paymentMode("online");
	}
}
