package CollectionRoomLearning;

// learning TreeSet

public class Car {
	int id;
	String brand;
	String color;
	double price;
	
	public Car(int id, String brand, String color, double price) {
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public String toString() {
		return "Id: "+id+ ", Brand: "+brand+ ", Color"+", Price: "+price;
	}
}
