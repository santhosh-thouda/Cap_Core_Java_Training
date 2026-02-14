package Oops;

public class Check {
	static int a;
	static int b;
	
	static int sum(int c, int d) {
		return c+d;
	}
	
	static {
		System.out.println("From Static 1...");
		System.out.println(a);
	}
	
	public static void main(String[]args) {
		System.out.println("From main...");
	}
	
	static {
		System.out.println("From static 2...");
		System.out.println(b);
	}
}
