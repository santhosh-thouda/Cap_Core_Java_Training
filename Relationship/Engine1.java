package Relationship;

public class Engine1 {
	// has a relation using constructor
	private int hp;
	
	Engine1(int hp){
		this.hp = hp;
	}
	
	Engine1(){};
	
	public int getHp() {
		return hp;
	}
} 