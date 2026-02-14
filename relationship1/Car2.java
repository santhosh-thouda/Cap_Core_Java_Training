package relationship1;

public class Car2 {
	private Engine2 e;
	
	private Engine2 createEngine(){
		if(e == null) {
			e = new Engine2(500);
		}
		else {
			System.out.println("Engine is already set");
		}
		
		return e;
	}
	
	public int getEngineHp() {
		return createEngine().getHp();
	}
}
