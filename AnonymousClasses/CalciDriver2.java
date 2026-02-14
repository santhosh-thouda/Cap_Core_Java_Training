package AnonymousClasses;

public class CalciDriver2 {
	public static void main(String[] args) {
		Calci2 calc = (a, b) -> System.out.println(a+b);
		calc.add(20, 50);
	}
}
