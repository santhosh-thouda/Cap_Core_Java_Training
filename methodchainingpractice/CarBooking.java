package methodchainingpractice;

public class CarBooking {
	CarBooking type(String type) {
		System.out.println("Type is "+type);
		return this;
	}
	CarBooking fuel(String fuel) {
		System.out.println("Fuel is "+fuel);
		return this;
	}
	CarBooking insurance(int insurance) {
		System.out.println("Insurance is " +insurance);
		return this;
	}
	CarBooking duration(int duration) {
		System.out.println("Insurance duration is " +duration+ " years");
		return this;
	}
	
	public static void main(String[] args) {
		new CarBooking()
			.type("SUV")
			.fuel("Diesel")
			.insurance(100000)
			.duration(2);
	}
}
