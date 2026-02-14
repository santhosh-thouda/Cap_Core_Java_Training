package CollectionRoomLearning;

//learning TreeSet

public class CarDriver{
	public static void main(String[] args) {
		CarOperations c = new CarOperations();
		
		c.addCar(new Car(291, "Innova Crysta", "Grey", 2500000));
		c.addCar(new Car(129, "Alto", "Black", 5500000));
		c.addCar(new Car(182, "Lamborghini", "Orange", 10000000));
		c.addCar(new Car(102, "Ferrari", "Red", 15000000));
		c.addCar(new Car(396, "Brezza", "Maroon", 1100000));
		c.addCar(new Car(757, "Creta", "White", 2000000));
		
		c.getAllCars();
		System.out.println();
		
		c.carsSortById();
		System.out.println();
		
		c.carsSortByPrice();
	}
}
