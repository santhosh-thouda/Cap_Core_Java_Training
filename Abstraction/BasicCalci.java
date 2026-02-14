package Abstraction;

public class BasicCalci extends AbstractBasicCalci {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		BasicCalci c = new BasicCalci();
		System.out.println(c.add(10, 20));
		System.out.println(c.sub(82, 19));
		System.out.println(c.mul(9, 10));
	}
}
