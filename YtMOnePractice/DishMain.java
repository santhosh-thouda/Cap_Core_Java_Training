package YtMOnePractice;

import java.util.*;

public class DishMain {
	public static void main(String[] args) {
		DishTest dt = new DishTest();
		List<Dish> list = new ArrayList<>();
		list.add(new Dish("Gazpacho"));
		list.add(new Dish("Tamon"));
		list.add(new Dish("Tortilla"));
		list.add(new Dish("Gazpacho"));
		list.add(new Dish("Biryani"));
		
		System.out.println(dt.addYummyToName(list));
		System.out.println(dt.count(list, "Gaz"));
	}
}
