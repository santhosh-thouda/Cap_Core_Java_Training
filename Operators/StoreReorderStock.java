package Operators;

public class StoreReorderStock {
	public static void main(String[]args) {
		int stock = 0;
		boolean fastMoving = true;
		boolean discontinued = false;
		
		stock += (stock < 0 || (fastMoving && !discontinued)) ? 20 : 0;
		System.out.println(stock);
	}
}
