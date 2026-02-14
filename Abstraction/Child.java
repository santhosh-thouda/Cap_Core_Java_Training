package Abstraction;

public class Child extends Parent {
	@Override
	void demo() {
		System.out.println("Demo from child");
	}

	public static void main(String[] args) {
		new Child().demo();
	}
}
