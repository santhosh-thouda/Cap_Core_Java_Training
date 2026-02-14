package Loops;

public class AsciiValues {
	public static void main(String[]args) {
		// Prining character : ascii for the even numbered value from a to s
		int n1 = (int)'a';
		int n2 = (int)'s';
		for(int i = n1; i<n2; i++) {
			if(i % 2 == 0) {
				char ch = (char) i;
				System.out.println(ch + " -> " +i);
			}
		}
	}
}
