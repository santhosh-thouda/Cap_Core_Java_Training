package Stream;

import java.util.Arrays;
import java.util.*;
import java.lang.*;

public class Example1 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9,2,3,4);
		int sum = 0;
		
		nums.stream()
			.filter(x -> x%2 == 0)
			.map(x -> x * 2)
			.forEach(System.out::println);
		
		System.out.println(sum);
	}
}
