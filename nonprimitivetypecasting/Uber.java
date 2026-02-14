package nonprimitivetypecasting;

public class Uber {
	int totalCarsBooked;
	int price;
	
	Uber(int price){
		this.price = price;
		totalCarsBooked++;
	}
	
	int getPrice() {
		return price;
	}
} 