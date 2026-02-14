package YtMOnePractice;

import java.util.*;

public class VehicleMain {
	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle("Alfa Romeo", 760000.0));
		list.add(new Vehicle("Bugatti", 95000.0));
		list.add(new Vehicle("Chrysler", 790000.0));
		list.add(new Vehicle("Dodge", 820000.0));
		
		VehicleImplementation vobj = new VehicleImplementation();
		System.out.println(vobj.sumOfPrices(list));
		System.out.println(vobj.getVehicleList(list));
		System.out.println(vobj.maxPrice(list));
	}
}
