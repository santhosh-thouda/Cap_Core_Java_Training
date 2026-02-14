package Interfaces;

public interface Example {
	static void demo() {
		System.out.println("Demo method");
	}
	
	static void test() {
		System.out.println("Test method from Example class");
	}
	
	public static void main(String[] args) {
		test();
	}
}
