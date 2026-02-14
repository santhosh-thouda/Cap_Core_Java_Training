package Operators;

public class SmartTrafficFine {
	public static void main(String[]args) {
		int speedLimit = 60;
		int speed = 50;
		boolean woreSeatBelt = true;
		int fineAmount = 1000;
		boolean fine = (speed > speedLimit && woreSeatBelt);
		
		System.out.println(fine ? "Fine Amount: "+fineAmount : "Safe Driving");
	}
}
