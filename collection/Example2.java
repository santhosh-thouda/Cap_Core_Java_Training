package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.lang.Iterable;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		System.out.println("Traversing in forward direction using Iterator");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Traversing in forward direction using ListIterator");
		ListIterator<Integer> lt = list.listIterator();
		while(lt.hasNext()) {	
			System.out.println(lt.next());
		}
		
		System.out.println("Traversing in backward direction using ListIterator");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
	}
}
