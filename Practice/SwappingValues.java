package Practice;

public class SwappingValues {
	
	public static void main(String[]args) {
		int a = 10;
		int b = 20;
		
		int temp = a;
		a = b;
		b = temp;

		System.out.println("A : " +a+ " , B : "+b);
		
		
		int c = 30;
		int d = 40;
		
		c = c+d;
		d = c-d;
		c = c-d;
		System.out.print(c+ " " +d);
	}
}