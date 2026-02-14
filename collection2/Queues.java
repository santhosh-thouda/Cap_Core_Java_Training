package collection2;

import java.util.*;

public class Queues {
	public static void main(String[] args) {
		Queue <Integer> qu = new LinkedList<>();
		qu.offer(10);
		System.out.println(qu);
		
		qu.add(70);
		System.out.println(qu);
		
		qu.offer(20);
		System.out.println(qu);
		
		qu.offer(30);
		System.out.println(qu);
		
		qu.poll();
		System.out.println(qu);
		
		qu.offer(40);
		System.out.println(qu);
		
		qu.poll();
		System.out.println(qu);
		
		qu.offer(50);
		System.out.println(qu);
		
		qu.offer(60);
		System.out.println(qu);
		
		System.out.println("Peek: " +qu.peek());
		System.out.println("Size: " +qu.size());

		for(int i : qu) {
			System.out.println(i);
		}
	}
}
