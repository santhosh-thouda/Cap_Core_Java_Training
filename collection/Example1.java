package collection;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.remove(0);
		list.addAll(list);
		list.addFirst(40);
		list.addLast(90);
		list.removeFirst();
		list.removeLast();
		list.add("Santhu is from Hyderabad");
		list.add("Yes I am from there.");
		list.add("Yes I am from there.");
		Example e = new Example();
		
		list.add(e.getList1());
		
		System.out.println(list.contains(20));
		System.out.println(list.get(5));
		
		System.out.println(list);
		
		list.forEach(elem -> {
			System.out.println(elem);
		}) ;
		
		for(Object i : list) {
			System.out.println(i);
		}
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.addFirst(2);
		list1.addAll(list1);
		list1.removeFirst();
		list1.add(30);
		list1.add(40);
		list1.removeLast();
		
		System.out.println(list1);
		System.out.println(list1.contains(20));
		
		for(int i : list1) {
			System.out.println(i);
		}
	}
}
