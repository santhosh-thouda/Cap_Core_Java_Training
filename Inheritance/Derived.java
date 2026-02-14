package Inheritance;

public class Derived extends Base{
	static {
		System.out.println("Child is Loaded");
	}
	static void display() {
		System.out.println("From Child display");
	}
	
	public static void main(String[] args) {
		Derived.display();
		Base.display();
	}
}
