package AnonymousClasses;

public class CalciMain {
	public static void main(String[] args) {
		Calci c = new Calci() {
			public void add(int a, int b) {
				System.out.println(a+b);
			}
		};
		
		c.add(10, 20);
	}
}
