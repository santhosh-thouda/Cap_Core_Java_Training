package Interfaces;

public class AdvancedCalciMain extends AdvancedCalci{
	public static void main(String[] args) {
		AdvancedCalci a = new AdvancedCalci();
		System.out.println(a.add(10, 321));
		System.out.println(a.sub(372, 263));
		System.out.println(a.mul(22, 32));
		System.out.println(a.power(5, 6));
		System.out.println(a.square(9));
	}
}
