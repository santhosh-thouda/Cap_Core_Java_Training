package polymorphism;

public class Child extends Parent{
	int b = 30;
	static void demo() {
		System.out.println("Child class demo...");
	}
	
	void display() {
		super.display();
		System.out.println("Child class display...");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		Parent.demo();
		p.display();
		System.out.println(p.a);
		System.out.println(p.b);
		
		Child c = new Child();
		Child.demo();
		c.display();		
		System.out.println(c.a);
		System.out.println(c.b);
	}
} 