package ExceptionHandlingPractice1;

class OutOfStockException extends Throwable{
	OutOfStockException(String msg){
		super(msg);
	}
}

public class Product {
	static void checkQuantity(int availableQuantity, int buyQuantity) throws OutOfStockException{
		if(buyQuantity > availableQuantity) {
			throw new OutOfStockException("Out of stock exception");
		}
		else {
			System.out.println("Successfully purchased");
		}
	}
	
	public static void main(String[] args){
		int availableQuantity = 5;
		int buyQuantity = 9;
		
		try {
			checkQuantity(availableQuantity, buyQuantity);
		}
		catch(OutOfStockException e) {
			System.out.println(e.getMessage());
		}
	}
}
