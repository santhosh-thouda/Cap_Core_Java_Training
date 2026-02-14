package methodchainingpractice;

public class StudentRegistration {
	StudentRegistration setName(String name) {
		System.out.println(name);
		return this;
	}
	StudentRegistration setAge(int age) {
		System.out.println(age);
		return this;
	}
	StudentRegistration setCity(String city) {
		System.out.println(city);
		return this;
	}
	StudentRegistration setYear(int year) {
		System.out.println(year);
		return this;
	}
	StudentRegistration setBranch(String branch) {
		System.out.println(branch);
		return this;
	}
	
	public static void main(String[] args) {
		StudentRegistration s = new StudentRegistration()
				.setName("Santhosh")
				.setAge(21)
				.setCity("Hyderabad")
				.setYear(4)
				.setBranch("CSE");
	}
}
