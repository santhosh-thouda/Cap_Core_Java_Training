package Encapsulation;

class StudentAge{
	private int age = 18;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age >= 5 && age <= 20) {
			this.age = age;
		}
	}
}

public class CollegeSystem {
	public static void main(String[]args) {
		StudentAge s = new StudentAge();
		System.out.println(s.getAge());
		s.setAge(19);
		System.out.println(s.getAge());
	}
}
