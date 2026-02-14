package relationship1;

public class Car1 {
	private Engine1 e;
	
	public Car1() {
		e = new Engine1(500);
	}
	
	public int getEngineHp() {
		return e.getHP();
	}
}
