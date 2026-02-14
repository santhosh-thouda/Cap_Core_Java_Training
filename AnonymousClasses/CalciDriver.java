package AnonymousClasses;

public class CalciDriver {
	public static void main(String[] args) {
		Calci1 calc = (i, j) -> (i+j);
		
		int result = calciOperation(5, 2, calc);
		System.out.println(result);
	}
	
	static int calciOperation(int i, int j, Calci1 calc) {
		return calc.operation(i, j);
	}
}
