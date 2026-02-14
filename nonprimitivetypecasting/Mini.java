package nonprimitivetypecasting;

public class Mini extends Uber{
	int price;
	int totalMiniBooked = 0;
	
	Mini(int price){
		super(price);
		System.out.println("Mini booked successfully");
		totalMiniBooked++;
	}
}
