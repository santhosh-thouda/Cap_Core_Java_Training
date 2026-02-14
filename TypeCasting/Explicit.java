package TypeCasting;

public class Explicit {
	public static void main(String[]args) {
		// narrowing : converting from bigger valued datatypes to smaller valued datatypes
		
		//example 1 : int to byte
		int a = 10;
		byte b = (byte) a;
		System.out.println(b);
		
		//example 2 : int to char
		int a1 = 100;
		char b1 = (char)a1;
		System.out.println(a1 + " " + b1);

		//example 3 : double to float
		double a2 = 121.9836473;
		float b2 = (float)a2;
		System.out.println(a2 + " " + b2);
		
		//example 4 : long to int
		long a3 = (long)900019358;
		int b3 = (int)a3;
		System.out.println(a3 + " " + b3);

		//example 5 : double to long
		double a4 = 9000148.39372929273;
		long b4 = (long)a4;
		System.out.println(a4 + " " + b4);

		//example 6 : double to byte
		double a5 = 2864838.39372929273;
		byte b5 = (byte)a5;
		System.out.println(a5 + " " + b5);
		
	}
}
