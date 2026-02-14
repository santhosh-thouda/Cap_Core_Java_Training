package Relationship;

public class Car3 {
	private Tyre3[] tyres;
	
	public Tyre3[] create() {
		if(tyres == null) {
			tyres = new Tyre3[] {
					new Tyre3("MRF"),
					new Tyre3("Apollo"),
					new Tyre3("CEAT"),
					new Tyre3("JK Tyre")
			};
		}
		return tyres;
	}
}
