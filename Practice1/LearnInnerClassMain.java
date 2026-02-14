package Practice1;

class LearnInnerClass {
	class Toy{
		public void toy() {
			System.out.println("Toy method");
		}
	}
}

public class LearnInnerClassMain{
	public static void main(String[] args) {
		
		// method 1 : 
		LearnInnerClass.Toy t = new LearnInnerClass() .new Toy();
		t.toy();
		
		// method 2 : we can do like this also
		LearnInnerClass lic = new LearnInnerClass();
		LearnInnerClass.Toy t1 = lic.new Toy();
		t1.toy();
	}
}
