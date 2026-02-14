package Interfaces;

public class InterfaceCalciVersion11 extends InterfaceCalci implements InterfaceCalciVersion1{
	public int power(int a, int b) {
		return (int) Math.pow(a, b);
	}
}