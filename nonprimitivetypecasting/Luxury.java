package nonprimitivetypecasting;

public class Luxury extends Uber{
	int price;
	int totalLuxuryBooked = 0;
	
	Luxury(int price){
		super(price);
		System.out.println("Luxury booked successfully");
		totalLuxuryBooked++;
	}
}