package ExceptionHandling;

public class TryFinally {
	public static void main(String[] args) {
		try {
			System.out.println("From outer Try block");
			try {
				System.out.println(10/0);
			}
			catch(NullPointerException e) {
				System.out.println("Null pointer exception occured");
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic exception");
			}
			finally {
				System.out.println("From inner finally block");
			}
		}
		finally {
			System.out.println("From outer finally block");
		}
	}
}
