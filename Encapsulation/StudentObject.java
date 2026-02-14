package Encapsulation;

class StudentObject1{
	private String name;
	private int rollNo;
	private boolean isSet = false;
	
	StudentObject1(){};
	
	public void setStudent(String name, int rollNo){
		if(!isSet) {
			this.name = name;
			this.rollNo = rollNo;
			isSet = true;
		}
		else {
			System.out.println("Name and Roll No is already set");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
}

public class StudentObject {
	public static void main(String[]args) {
		StudentObject1 obj = new StudentObject1();
		
		obj.setStudent("Santhosh", 01);
		System.out.println(obj.getName());
		System.out.println(obj.getRollNo());
		
		obj.setStudent("Sanjana", 02);
		System.out.println(obj.getName());
		System.out.println(obj.getRollNo());

		obj.setStudent("Harika", 03);
		System.out.println(obj.getName());
		System.out.println(obj.getRollNo());
	}
}
