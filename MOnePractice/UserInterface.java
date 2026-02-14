package MOnePractice;

public class UserInterface {
	private String name;
	private int age;
	private String email;
	private String creditCard;
	
	public UserInterface(String name, int age, String email, String creditCard) {
		this.setName(name);
		this.setAge(age);
		this.setEmail(email);
		this.setCreditcard(creditCard);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreditcard() {
		return creditCard;
	}

	public void setCreditcard(String creditCard) {
		this.creditCard = creditCard;
	}
	
	
}
