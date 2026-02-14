package Operators;

public class TrafficFine {
	public static void main(String[]args) {
		int speed = 90;
		int limit = 60;
		boolean emergency = false;
		int fine = 0;
		
		fine += (speed > limit && !emergency) ? 1000 : 0;
		System.out.println(fine);
	}
}
