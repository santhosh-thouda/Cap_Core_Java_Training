package nonprimitivetypecasting;

public class Sedan extends Uber{
	int price;
	int totalSedanBooked = 0;
	
	Sedan(int price){
		super(price);
		System.out.println("Mini booked successfully");
		totalSedanBooked++;
	}
}
