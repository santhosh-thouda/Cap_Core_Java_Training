package Practice1;

interface AnimalSound{
	void sound();
}

interface AnimalColor{
	void color();
}

class Dog implements AnimalSound, AnimalColor{
	@Override
	public void sound() {
		System.out.println("Barking...");	
	}
	
	@Override
	public void color() {
		System.out.println("Black");
	}
}

class Cat implements AnimalSound, AnimalColor{
	@Override
	public void sound() {
		System.out.println("Meow Meow...");	
	}
	
	@Override
	public void color() {
		System.out.println("Grey");
	}
}

class Parrot implements AnimalSound, AnimalColor{
	@Override
	public void sound() {
		System.out.println("Khich Khich...");	
	}
	
	@Override
	public void color() {
		System.out.println("Green");
	}
}


public class AnimalClass {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.color();
		
		Cat c = new Cat();
		c.sound();
		c.color();
		
		Parrot p = new Parrot();
		p.sound();
		p.color();
	}
}


