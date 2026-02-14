package ExceptionHandlingPractice;

public class ShoppingCart {
	public static void main(String[] args) {
		String[] arr = {"Mobile", "Laptop", "Headphones"};
		
		try {
			int index = 5;
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
	}
}
