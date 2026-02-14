package Relationship;

public class TyreDriver3 {
	public static void main(String[]args) {
		Car3 c = new Car3();
		Tyre3[] t = c.create();
		
		for(int i = 0; i<t.length; i++) {
			System.out.println(t[i]);
		}
	}
}

