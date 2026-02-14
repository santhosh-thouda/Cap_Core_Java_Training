package methodchainingpractice;

public class MobileShoppingApp {
	MobileShoppingApp brand(String brand){
		System.out.println("Brand is " +brand);
		return this;
	}
	
	MobileShoppingApp color(String color) {
		System.out.println("Color is " +color);
		return this;
	}
	
	MobileShoppingApp price(int price) {
		System.out.println("Price is " +price);
		return this;
	}
	
	public static void main(String[] args) {
		MobileShoppingApp m = new MobileShoppingApp().brand("Redmi").color("Black").price(20000);
		new MobileShoppingApp()
			.brand("Apple")
			.color("Silver")
			.price(79000);
		
	}
}
