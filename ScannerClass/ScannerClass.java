package ScannerClass;
import java.util.*;

public class ScannerClass {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(n);
		
		String str = sc.nextLine();
		System.out.println(str);
		
		float n1 = sc.nextFloat();
		System.out.println(n1);
		
		char c = sc.next().charAt(0);
		System.out.println(c);
		
		byte b = sc.nextByte();
		System.out.println(b);
		
	}
}
