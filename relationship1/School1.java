package relationship1;

public class School1 {
	private Principal1 p;
	
	School1(){
		p = new Principal1("Santhu");
	}
	
	public String getPrincipal() {
		return p.getName();
	}
}
