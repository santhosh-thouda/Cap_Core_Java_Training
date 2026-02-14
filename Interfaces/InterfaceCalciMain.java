package Interfaces;

public class InterfaceCalciMain {
	public static void main(String[] args) {
		InterfaceCalci basic = new InterfaceCalci();
		System.out.println(basic.add(122, 243));
		System.out.println(basic.sub(474, 142));
		System.out.println(basic.mul(6, 9));
		
		InterfaceCalciVersion11 version1 = new InterfaceCalciVersion11();
		System.out.println(version1.power(5, 4));
		
		InterfaceCalciVersion22 version2 = new InterfaceCalciVersion22();
		System.out.println(version2.square(19));
	}
} 