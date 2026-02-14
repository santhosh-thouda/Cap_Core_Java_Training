package Stream;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		int[] arr = {10, 20, 31, 40, 53};
		//
//		Arrays.stream(arr).filter(x -> x%2 == 0).forEach(System.out::println);
		
		List<Integer> list = Arrays.asList(10, 21, 39, 32, 12, 19, 29);
//		list.stream().filter(x -> x%2 != 0).map(x -> x *x).forEach(System.out::println);;

		List<String> list1 = Arrays.asList("Santhu", "Sanjana", "Dheeraj", "Uthkarsh", "Shubham");
//		list1.stream().map(x -> x.toLowerCase()).forEach(System.out::println);
//		list1.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
		
		
	}
	
	
}
