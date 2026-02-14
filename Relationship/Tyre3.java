package Relationship;

public class Tyre3 {
	private String brand;
	
	private String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	Tyre3(){};
	
	Tyre3(String brand){
		this.brand = brand;
	}
	
	public String toString() {
		return brand;
	}
}
