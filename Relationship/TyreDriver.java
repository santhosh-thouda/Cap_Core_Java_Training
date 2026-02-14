package Relationship;

public class TyreDriver {
	public static void main(String[]args) {
		Car2 c = new Car2();
		
		for(int i = 0; i<c.getTyres().length; i++) {
			System.out.println(c.getTyres()[i].toString());
		}
	}
}


//
//   JVM
//    ↓
//   TyreDriver.main()
//    ↓
//   new Car2()
//    ↓
//   Tyre objects created (4 times)
//    ↓
//   getTyres()
//    ↓
//   tyres[i]
//    ↓
//   toString()
//    ↓
//   Output printed