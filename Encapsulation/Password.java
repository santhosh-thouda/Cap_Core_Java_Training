package Encapsulation;

class Password1{
	private String password;
	
	public String getPassWord() {
		return password;
	}
	
	public void setPassword(String password) {
		if(password.length() >= 8) {
			this.password = password;
		}
		else {
			System.out.println("Passoword length must be more then 8");
		}
	}
}

public class Password {
	public static void main(String[] args) {
		String password;
		Password1 p = new Password1();
		p.setPassword("Hello@123");
		System.out.println(p.getPassWord());
	}
}
