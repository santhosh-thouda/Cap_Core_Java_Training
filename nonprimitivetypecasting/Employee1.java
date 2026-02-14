package nonprimitivetypecasting;

public class Employee1 extends Person1{
	int eid;
	String role;
	
	Employee1(String name, String address, int eid, String role){
		super(name, address);
		this.eid = eid;
		this.role = role;
	}
}
