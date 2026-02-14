package Relationship;

public class Car1 {
	// has a relation using constructor
	private Engine1 e;
	
//		// early instantiation
//	Car1(){
//		e = new Engine1(500); 
//	}
	
//	
//	public int getHp(){
//		return e.getHp();
//	}
	
	
	// lazy instantiation
	public int getHp() {
		if(e == null) {
			e = new Engine1(500);
		} 
		return e.getHp();
	}
}
