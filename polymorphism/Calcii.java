package polymorphism;

public class Calcii extends Calci{
	@Override
	public void add() {
		System.out.println(20+30);
	}
	
	public static void main(String[] args) {
		Calci c = new Calcii();
		c.add();
		Calcii c1 = (Calcii)c;
		c1.add();
	}
}
