package EncapsulationPractice;

class Marks{
	private int marks;
	
	public void setMarks(int marks) {
		if(marks >= 0 && marks <= 100) {
			this.marks = marks;			
		}
		else {
			System.out.println("Marks should be bwtween 0 and 100");
		}
	}
	public int getMarks() {
		return marks;
	}
}

public class StudentMarks {
	public static void main(String[] args) {
		Marks m = new Marks();
		m.setMarks(919);
		System.out.println(m.getMarks());
	}
}
