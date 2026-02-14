package Relationship;

public class Car2 {
	private String color;
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// achieving Has A early instantiation
	private Tyre[] tyres = {new Tyre("MRF"), 
			new Tyre("Apollo"), 
			new Tyre("CEAT"), 
			new Tyre("Michilin")
	};
	
	public Tyre[] getTyres() {
		return tyres;
	}	
}
