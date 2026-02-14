package WrapperClasses;

public class Example {
	public static void main(String[] args) {
		int a = 10;
		Integer b = a;
		System.out.println(b);
		
		Integer c = 25;
		System.out.println(c.intValue());
		
		System.out.println(Integer.valueOf(b));
		
		String d = "1234";
		System.out.println(d);
		System.out.println(Integer.parseInt(d));
		
		String e = String.valueOf(d);
		System.out.println(e);
		
		int f = (Integer.compare(a, c));
		System.out.println(f);
		
		int g = 912;
		String h = String.valueOf(g);
		System.out.println(g);
		System.out.println(h);
	}
}