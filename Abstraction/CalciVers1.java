package Abstraction;

public class CalciVers1 extends AbstractBasicVer1 {
	public int add(int a, int b) {
		return a + b;
	};

	public int sub(int a, int b) {
		return a - b;
	};

	public int mul(int a, int b) {
		return a * b;
	};

	@Override
	int power(double a, double b) {
		return (int) Math.pow(a, b);
	}

	public static void main(String[] args) {
		CalciVers1 c = new CalciVers1();
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(192, 92));
		System.out.println(c.mul(21, 2));
		System.out.println(c.power(5, 5));
	}
}