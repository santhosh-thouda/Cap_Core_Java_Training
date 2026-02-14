package Oops;

public class Marker {
	Marker(int a, int b){
		System.out.println("...From Marker..." + (a+b));
	}
	Marker(){
		System.out.println("Hello");
	}
	public static void main(String[]args) {
		System.out.println("...Main starts...");
		Marker m = new Marker(2,3);
		Marker m1 = new Marker();
		Marker m2 = new Marker(10,12);
		System.out.println("...Main ends...");
	}
}
