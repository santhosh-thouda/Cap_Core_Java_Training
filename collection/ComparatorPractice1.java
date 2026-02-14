package collection;

import java.util.*;

import java.lang.*;

class Comp1 implements Comparator<String>{
	public int compare(String str1, String str2) {
		return str1.length() - str2.length();
	}
}

public class ComparatorPractice1 {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("Santhosh is a good boy");
		str.add("Dheeraj does the problem solving good");
		str.add("Sanjana is from Jaipur");
		str.add("Shashwat sits infront of me");
		
		Collections.sort(str, new Comp1());
		
		System.out.println(str);
	}
}
