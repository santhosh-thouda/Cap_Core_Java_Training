package methodchainingpractice;

public class BankAccount {
	private String name;
	private int age;
	private int balance;
	private String activate;
	
	BankAccount setName(String name) {
		this.name = name;
		return this;
	}
	BankAccount setAge(int age) {
		this.age = age;
		return this;
	}
	BankAccount setBalance(int balance) {
		this.balance = balance;
		return this;
	}
	BankAccount activate(String activate) {
		this.activate = activate;
		return this;
	}
	
	String getName(){
		return name;
	}
	int getAge() {
		return age;
	}
	int getBalance() {
		return balance;
	}
	String activate() {
		return activate;
	}
	
	public static void main(String[] args) {
		BankAccount b = new BankAccount()
				.setName("Santhosh")
				.setAge(21)
				.setBalance(10000)
				.activate("Yes");
		
		System.out.println(b.getName());
		System.out.println(b.getAge());
		System.out.println(b.getBalance());
		System.out.println(b.activate());
				
	}
}
