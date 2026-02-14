package nonprimitivetypecasting;

public class Main2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = d;
		
		if(a instanceof Cat) {
			Cat c = new Cat();
			c.meow();
		}
		else {
			Dog d1 = (Dog)a;
			d1.bark();
		}
	}
}
