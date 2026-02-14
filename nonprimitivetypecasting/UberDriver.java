package nonprimitivetypecasting;
import java.util.Scanner;

public class UberDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Click 1 for Mini \nClick 2 for Sedan \nClick 3 for Luxury");
		int select = sc.nextInt();
		
		Uber u = null;
		switch(select) {
			case 1:
				u = new Mini(500);
				break;
			case 2:
				u = new Sedan(750);
				break;
			case 3:
				u = new Luxury(1200);
				break;
		}
		
		System.out.println("Price: " +u.getPrice());
		System.out.println("Total bookings: " +u.totalCarsBooked);
		
		if(u instanceof Mini) {
			Mini m = (Mini)u;
			System.out.println("Mini bookings: " +m.totalMiniBooked);
		}
		else if(u instanceof Sedan) {
			Sedan s = (Sedan)u;
			System.out.println("Sedan bookings: " +s.totalSedanBooked);
		}
		else {
			Luxury l = (Luxury)u;
			System.out.println("Luxury bookings: " +l.totalLuxuryBooked);
		}
	}
}
