package AnonymousClasses;

// use of lambda for hash tables

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(101, "Santhosh");
		map.put(102, "Arjun");
		map.put(103, "YashKarle");
		map.put(104, "Dheeraj");
		
		map.forEach((k, v) -> System.out.println("Key: "+k+ ", Value: "+v));
	}
}
