package YtMOnePractice;

import java.util.ArrayList;

public class PersonMain {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
//		list.add(new Person("Santhosh", 69));
//		list.add(new Person("Arjun", 60));
//		list.add(new Person("Harika", 48));
//		list.add(new Person("Poonam", 90));
//		list.add(new Person("Munawar", 38));
//		
		list.add(new Person("perry", 20));
		list.add(new Person("Ferry", 52));
		list.add(new Person("Katty", 100));
		list.add(new Person("Elly", 14));
		StreamImplementation s = new StreamImplementation();
		System.out.println(s.sumAge(list));
		System.out.println(s.printName(list));
		System.out.println(s.printAge(list));
		
	}
}
