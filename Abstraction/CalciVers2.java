package Abstraction;

public class CalciVers2 extends AbstractBasicVer2 {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public int square(double a) {
		return (int) (a * a);
	}

	public static void main(String[] args) {
		CalciVers2 c = new CalciVers2();
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(192, 92));
		System.out.println(c.mul(21, 2));
		System.out.println(c.square(5));
	}
}
