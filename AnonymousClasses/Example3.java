package AnonymousClasses;

import java.util.*;

// arrays, lists using lambda operations

public class Example3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,12,21,23,30,40, 50, 24));
		System.out.println(list);
		
		List<Integer> list1 = Arrays.asList(10,20,30,12,21,23,30,40, 50, 24);
		System.out.println(list1);
		
		list.removeIf(i -> i%2 == 0);
		System.out.println(list);
		
//		list1.replaceAll(x -> x*2);
//		System.out.println(list1);
		
		list1.replaceAll(x -> x%2 == 0 ? 0 : x);
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>(Arrays.asList("Hyderabad", "Bangalore", "Pune", "Mumbai"));
		System.out.println(list2);
		
//		list2.removeIf(x -> x == "Hyderabad");
//		System.out.println(list2);
		
		list2.replaceAll(x -> x.toUpperCase());
		System.out.println(list2);
		
		list2.replaceAll(x -> x.toUpperCase());
		System.out.println(list2);
		
		list2.replaceAll(x -> x.toLowerCase());
		System.out.println(list2);
		
		System.out.println(list2.contains("mumbai"));
		
		list2.replaceAll(x -> x.length() >= 4 ? x.substring(0, 3) : x);
		System.out.println(list2);
		
		list2.replaceAll(x -> x.replace('a', '*'));
		System.out.println(list2);
	}
} 