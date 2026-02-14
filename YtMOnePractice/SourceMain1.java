package YtMOnePractice;

import java.util.*;

public class SourceMain1 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(73);
		numbers.add(24);
		numbers.add(10);
		numbers.add(15);
		numbers.add(5);
		
		Source1 s = new Source1();
		System.out.println(s.getItemIndex(numbers, 2));
		
		System.out.println(s.sum(numbers));
		
		System.out.println(s.splitAndReverse(numbers));
	}
}
