package Oops;

public class Example2 {
	int a;
	char b;
	float c;
	public static void main(String[]args) {
		Example.demo();
		Example e = new Example();
		e.d = 23;
		System.out.println(e.d);
		e.demo();
		Example e3 = new Example();
		System.out.println(e3.d);
		
		Example e1 = new Example();
		e1.demo();
		Example2 e2 = new Example2();
		System.out.println(e2.a);
		System.out.println(e2.b);
		System.out.println(e2.c);
		
	} 
} 
