package CollectionRoomLearning;

import java.util.*;

//learning TreeSet

public class CarOperations {
	ArrayList<Car> clist = new ArrayList<>();
	
	void addCar(Car c) {
		clist.add(c);
	}
	
	public void getAllCars() {
		for(Car c : clist) {
			System.out.println(c);
		}
	}
	
	public void carsSortById() {
		TreeSet<Car> ts = new TreeSet<>(new CarIdCompare());
		ts.addAll(clist);
		
		System.out.println("After Sorting Cars By Id...");
		for(Car c : ts) {
			System.out.println(c);
		}
	}
	
	public void carsSortByPrice() {
		TreeSet<Car> ts = new TreeSet<>(new CarPriceCompare());
		ts.addAll(clist);
		
		System.out.println("After Sorting Cars By Price...");
		for(Car c : ts) {
			System.out.println(c);
		}
	}
}
