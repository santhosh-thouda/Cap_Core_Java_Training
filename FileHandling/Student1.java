package FileHandling;

import java.io.Serializable;

public class Student1 implements Serializable{
	int id;
	String name;
	
	Student1(int id, String name){
		this.id = id;
		this.name = name;
	}
}
