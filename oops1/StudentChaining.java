package oops1;

class StudentCh{
	private String name;
	private int age;
	private String college;
	
	public StudentCh setName(String name) {
		this.name = name;
		return this;
	}
	
	public StudentCh setAge(int age) {
		this.age = age;
		return this;
	}
	
	public StudentCh setCollege(String college) {
		this.college = college;
		return this;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(college);
	}
}

public class StudentChaining {
	public static void main(String[]args) {
		
		//method 1 for method chaining
//		StudentCh s = new StudentCh();
//		s.setName("Santhosh").setAge(21).setCollege("Lovely Professional University");
//		System.out.println(s.getName());
//		System.out.println(s.getAge());
//		System.out.println(s.getCollege());
		
		
		//method 2 for method chaining
//		new StudentCh()
//				.setName("Santhosh")
//				.setAge(21)
//				.setCollege("Lovely Professional University")
//				.show();
		
		
		// method 3 for method chaining
		String s1 = new StudentCh()
				.setName("Santhosh")
				.setAge(21)
				.setCollege("Lovely Professional University")
				.getCollege();
				
		System.out.println(s1);
		
	}
}
