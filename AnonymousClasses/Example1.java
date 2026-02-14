package AnonymousClasses;

import java.util.*;

import java.util.Arrays;

// use of lambda

public class Example1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23,10,233,20,111,30,1,40,92,50,32,60,42,70,80,90,111);
//		list.forEach(i -> System.out.print(i+ " "));
		
		// even numbers
//		list.stream().filter(i -> i%2 == 0)System.out::print);;
		
		// sort
		Collections.sort(list); // ascending order
		Collections.sort(list, (a,b) -> a-b); // ascending order
		Collections.sort(list, (a,b) -> b-a); // descending order
		System.out.println(list);
	}
}