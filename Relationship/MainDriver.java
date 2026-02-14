package Relationship; 

public class MainDriver { 
	// Has-A relationship 
	
	public static void main(String[]args) { 
		Car c = new Car(); 
		c.e.setHp(1200); // here we can't use directly e if the object e is private   
		System.out.println(c.getEngine().getHp());  
	} 
} 