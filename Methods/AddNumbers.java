package Methods;

public class AddNumbers {
	static int add(int n1, int n2) {
		return n1+n2;
	}
	static int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	static double add(double n1, double n2) {
		return n1+n2;
	}
	
	public static void main(String[]args) {
		System.out.println(add(9,10));
		System.out.println(add(54,12, 98));
		System.out.println(add(8.1,39.4));
	}
}
