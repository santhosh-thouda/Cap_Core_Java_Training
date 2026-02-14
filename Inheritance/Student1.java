package Inheritance;

public class Student1 extends Person1{
	static String name = "Dinga child";
	static int price = 200;
	
	void display() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(price);
		System.out.println(super.price);
	}
	
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.display();
	}
}