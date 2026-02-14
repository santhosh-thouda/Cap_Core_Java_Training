package oops1;

class Marker1{
	// method chaining
	private int price;
	private String color;
	
	public Marker1 setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public int getPrice() {
		return price;
	}
	
	public Marker1 setColor(String color) {
		this.color = color;
		return this;
	}
	
	public String getColor() {
		return color;
	}
}

public class Marker {
	public static void main(String[]args) {
		Marker1 m = new Marker1();
		m.setColor("Red").setPrice(200000);
		
		System.out.println(m.getColor());
		System.out.println(m.getPrice());
	}
}
