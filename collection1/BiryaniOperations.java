package collection1;

import java.util.*;

public class BiryaniOperations {
	ArrayList<Biryani> bList = new ArrayList<>();
	
	void addBiryani(Biryani b) {
		bList.add(b);
	}
	
	public void displayBiryanis(){
		for(Biryani b : bList) {
			System.out.println(b);
		}
	}
	
	public void biryaniSortById() {
		TreeSet<Biryani> ts = new TreeSet<>(new BiryaniComparator());
		ts.addAll(bList);
		
		System.out.println("After Sorting By Id");
		for(Biryani b : ts) {
			System.out.println(b);
		}
	}
	
	public void biryaniSortByPrice() {
		TreeSet<Biryani> ts = new TreeSet<>(new BiryaniComparator1());
		ts.addAll(bList);

		System.out.println("After Sorting By Price");
		for(Biryani b : ts) {
			System.out.println(b);
		}
	}
}
