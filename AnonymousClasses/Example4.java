package AnonymousClasses;

import java.util.*;

// method references

public class Example4 {
	String name;
	
	public void display() {
		System.out.println("Name: " +name);
	}
	
	public String display(String name) {
		return "Name: "+name;
	}
	
	Example4(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		ArrayList<Example4> elist = new ArrayList<>();
		elist.add(new Example4("Santhu"));
		elist.add(new Example4("Sanjana"));
		elist.add(new Example4("Harika"));
		
//		 using lambda
		System.out.println("Using lambda...");
		elist.forEach(x -> x.display());
		
		System.out.println("\nUsing Method References...");
		// using method reference
		elist.forEach(Example4::display);
	}
}
