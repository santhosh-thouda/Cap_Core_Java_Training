package YtMOnePractice;

import java.util.*;

public class Source1 {
	public int sum(ArrayList<Integer> numbers) {
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		return sum;
	}
	
	public ArrayList<Integer> splitAndReverse(ArrayList<Integer> list) {
		ArrayList<Integer> firstHalf = new ArrayList<>();
		for(int i = 0; i<=list.size()/2; i++) {
			firstHalf.add(list.get(i));
		}
		
		ArrayList<Integer> secondHalf = new ArrayList<>();
		for(int i= (list.size()/2)+1; i<list.size(); i++) {
			secondHalf.add(list.get(i));
		}
		
		ArrayList<Integer> combined = new ArrayList<>();
		combined.addAll(firstHalf.reversed());
		combined.addAll(secondHalf.reversed());
		
		return combined;
	}
	
	public Integer getItemIndex(ArrayList<Integer> list, int index) {
		for(int i = 0; i<list.size(); i++) {
			if(i == index) {
				return list.get(i);
			}
		}
		return null;
	}
} 