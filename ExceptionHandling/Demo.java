package ExceptionHandling;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Heyy!");
		System.out.println("Hello");
//		System.out.println(10/0);
		System.out.println("Santhosh");
		
		
		//one try-catch
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero Exception : 10 " +e.getMessage());
		}
		finally {
			System.out.println("This block always exceutes");
		}
		
		
		
		// with multiple catch blocks (using particular exception class)
		int[] arr = new int[2];
		try {
			arr[4] = 2;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of bound exception occured");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic");
		}
		
		
		// using parent Exception class
		try {
			arr[10] = 10;
		}
		catch(Exception e) {
			System.out.println("Array Index Bound Exception");
		}
		
		// using parent Throwable class
		try {
			arr[10] = 10;
		}
		catch(Throwable e) {
			System.out.println("Array Index Bound Exception");
		}
		
		
		//try catch with parent(Exception class) and child classes, Exception must be at last
		try {
			int a = 20/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("Last catch block Exception Class");
		}
//		finally {
//			System.out.println("This is by default excecuted");
//		}
	}
}
