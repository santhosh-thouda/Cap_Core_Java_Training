package Oops;

class Demo{
	static int i;
	int j;
	
	void display() {
		System.out.println("From display...");
		System.out.println(i);
		System.out.println(j);
	}
}

public class DemoDriver {
	public static void main(String[]args) {
		Demo d = new Demo();
		d.display();
		System.out.println(d);
		
		Demo d1 = new Demo();
		d1.display();
		System.out.println(d1);
	}
}