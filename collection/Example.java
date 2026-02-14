package collection;

import java.util.ArrayList;

public class Example{
	
	public static ArrayList getList1() {
		ArrayList list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		
		return list1;
	}
	public static void main(String[] args) {
		
		// Non generic type of data (No specified Wrapper data type>
		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add("Hello");
		list.add(30.9);
		list.add("Santhosh");
		list.add(52);
		list.add("How are you?");
		list.add(70);
		System.out.println(list);
		
		// Generic type of data (Specified Wrapper data type>
		ArrayList<Integer> list1 = new ArrayList<>(5);
		list1.add(120);
		list1.add(130);
		list1.add(140);
		list1.remove(Integer.valueOf(120));
		list1.get(0);
		list1.add(160);
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.addAll(list1);
		list2.add(190);
		list2.add(180);
		System.out.println(list2);
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(130);
		System.out.println(list3);
		list3.addAll(list2);
		list3.remove(list3.get(0));
		System.out.println(list3);
		list3.removeAll(list2);
		System.out.println(list3);
	}
}
