package collection;

import java.util.*;
import java.lang.*;

// Integer last digit comparision
class Com implements Comparator<Integer>{
	public int compare(Integer i, Integer j) {
		return (i%10) - (j%10);
	}
}

// using comparator just for check list value, and making them ascending order

class Com12 implements Comparator<Integer>{
	public int compare(Integer i, Integer j) {
		return i - j;
	}
}

public class ComparatorPractice {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(17);
		nums.add(75);
		nums.add(28);
		nums.add(91);
		
//		Collections.sort(nums, new Com());
		Collections.sort(nums, new Com12());
		
		System.out.println(nums);
	}
}
