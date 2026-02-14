package YtMOnePractice;

import java.util.*;

public class DishTest {
	
	public List<Dish> addYummyToName(List<Dish> list) {
		ArrayList<Dish> dishList = new ArrayList<>();
		for(Dish d : list) {
			Dish dish = new Dish("Yummy : "+d.getDishName());
			dishList.add(dish);
		}
		return dishList;
	}
	
	public long count(List<Dish> list, String s) {
		long count = 0;
		for(Dish d : list) {
			if(d.getDishName().contains(s)) {
				count++;
			}
		}
		return count;
	}
}
