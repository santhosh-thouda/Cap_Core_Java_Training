package collection;

import java.util.LinkedList;
import java.util.List;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.ListIterator;


class Student2{
	int id;
	String name;
	Student2(int id, String name){
		this.id = id;
	}
}


public class Linkedlist {
	public static void main(String[] args) {
		LinkedList <Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		System.out.println("LinkedList elements iteration using for each loop");
		for(int i : ll) {
			System.out.println(i);
		}
		
		System.out.println("LinkedList elements iteration using iterator");
		Iterator<Integer> llit = ll.iterator();
		while(llit.hasNext()) {
			System.out.println(llit.next());
		}
		
		System.out.println("LinkedList elements forward iteration using ListIterator");
		ListIterator<Integer> llit1 = ll.listIterator();
		while(llit1.hasNext()) {
			System.out.println(llit1.next());
		}
		
		System.out.println("LinkedList elements backward iteration using ListIterator");
		while(llit1.hasPrevious()) {
			System.out.println(llit1.previous());
		}
		
		System.out.println("After performing operations on Linked List");
		ll.add(40);
		ll.add(50);
		ll.remove();
		ll.add(60);
		ll.removeFirst();
		ll.removeLast();
		ll.addAll(ll);
		ll.addFirst(70);
		
		ListIterator<Integer> llit2 = ll.listIterator();
		while(llit2.hasNext()) {
			System.out.println(llit2.next());
		}
		
		LinkedList <Student> s = new LinkedList<>();
		s.add(new Student(101, "Santhosh"));
		s.add(new Student(102, "Dheeraj"));
		s.add(new Student(103, "Shashwat"));
		s.add(new Student(104, "Uthkarsh"));
		
		ListIterator ss = s.listIterator();
		while(ss.hasNext()) {
			Student sss = (Student) ss.next();
			System.out.println(sss.id+ ": " +sss.name);
			
			// incorrect code syntax
//			System.out.println(ss.next().id);
//			System.out.println(ss.next().name);
		} 
	}
}
