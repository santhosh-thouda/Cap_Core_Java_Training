package Operators;

public class MovieTheatre {
	public static void main(String[]args) {
		int ticketPrice = 250;
		int discount = 30;
		int age = 10;
		
		boolean eligible = (age < 12 || age > 60);
		
		int finalPayment = eligible ? ticketPrice - (ticketPrice*discount / 100) : ticketPrice;
		
		System.out.println("Final Price after discount: "+finalPayment);
	}
}
