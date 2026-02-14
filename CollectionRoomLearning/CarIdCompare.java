package CollectionRoomLearning;

import java.util.*;

//learning TreeSet

public class CarIdCompare implements Comparator<Car>{
	public int compare(Car c1, Car c2) {
		return c1.id - c2.id;
	}
}
