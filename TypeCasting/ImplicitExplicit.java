package TypeCasting;

public class ImplicitExplicit {
	public static void main(String[]args) {
		// widening (implicit)
		int a = 5;
		double b = a;
		System.out.println(a + " " + b);
		
		float a1 = (float) 10.4;
		double b1 = a1;
		System.out.println(a1 + " " + b1);
		
		char a2 = 's';
		int b2 = a2;
		System.out.println(a2 + " " + b2);
		
		//narrowing (explicit)
		double c = 10.5;
		int d = (int) c; 
		System.out.println(c + " " + d);
		
		
		float c1 = (float) 10.4;
		double d1 = c1;
		System.out.println(c1 + " " + d1);
		
		int c2 = 100;
		char d2 = (char) c2;
		System.out.println(c2 + " " + d2);
	}
}
