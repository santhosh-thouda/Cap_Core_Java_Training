package YtMOnePractice;

import java.util.*;

public class StreamImplementation {
	public int sumAge(List<Person>list) {
		return list.stream()
			.filter(x -> (x.getAge()>50))
			.mapToInt(x -> x.getAge())
			.sum();
	}
	
	public List<String> printName(List<Person> list) {
		return list.stream()
				.map(x -> x.getName())
				.toList();
	}
	
	public List<Integer> printAge(List<Person> list){
		return list.stream()
				.map(x -> x.getAge())
				.toList(); 
	}
}
