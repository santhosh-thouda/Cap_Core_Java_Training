package Oops;

public class Check1 {
	public static void main(String[]args) {
		Check ch = new Check();
		ch.a = 10;
		ch.b = 20;
		
		Check ch1 = new Check();
		
		System.out.println(ch1.sum(ch1.a, ch1.b));
	}
}
