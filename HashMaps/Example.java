package HashMaps;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(10, map.getOrDefault(10, 0) + 1);
		map.put(10, map.getOrDefault(10, 0) + 1);
		map.put(10, map.getOrDefault(10, 0) + 1);
		map.put(20, map.getOrDefault(20, 0) + 1);
		map.put(20, map.getOrDefault(20, 0) + 1);
		map.put(20, map.getOrDefault(20, 0) + 1);
		map.put(30, map.getOrDefault(30, 0) + 1);
		map.put(30, map.getOrDefault(30, 0) + 1);
		map.put(30, map.getOrDefault(30, 0) + 1);
		map.put(40, map.getOrDefault(40, 0) + 1);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
	}
}
