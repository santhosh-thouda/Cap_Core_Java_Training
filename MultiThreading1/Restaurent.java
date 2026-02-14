package MultiThreading1;

public class Restaurent {
	public static void main(String[] args) {
		Thread t1 = new CookingTask("Pasta");
		Thread t2 = new CookingTask("Maggi");
		Thread t3 = new CookingTask("Rice");
		Thread t4 = new CookingTask("Manchurian");
		Thread t5 = new CookingTask("Noodles");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
