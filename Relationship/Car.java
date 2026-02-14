package Relationship;

public class Car {
	// Has A relationship
	private String brand;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// storing engine ref 
	// Early instantiation - initializer
	Engine e = new Engine();
	
	public Engine getEngine() {
		return e;
	}
} 