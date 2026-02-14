package nonprimitivetypecasting;

public class Main1 {
	public static void main(String[] args) {
		Person1 p = new Employee1("Santhosh", "Hyderabad", 101, "Sde");
		Employee1 e = new Employee1(p.name, p.address, 101, "Sde");
		System.out.println(p.name);
		System.out.println(p.address);
		System.out.println(e.eid);
		System.out.println(e.role);
		
		Employee1 e1 = (Employee1)p;
		System.out.println(e1.eid);
		System.out.println(e1.role);
	}
}
