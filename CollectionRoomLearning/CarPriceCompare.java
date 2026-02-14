package CollectionRoomLearning;

import java.util.*;

//learning TreeSet

public class CarPriceCompare implements Comparator<Car>{
	public int compare(Car c1, Car c2) {
		return (int) (c1.price - c2.price);
	}
}
