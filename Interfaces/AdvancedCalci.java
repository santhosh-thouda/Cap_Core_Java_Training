package Interfaces;

public class AdvancedCalci implements BasicCalci, AddPower, AddSquare{
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
	
	@Override
	public int power(int a, int b) {
		return (int)Math.pow(a, b);
	}
	
	@Override
	public int square(int a) {
		return a*a;
	}
} 