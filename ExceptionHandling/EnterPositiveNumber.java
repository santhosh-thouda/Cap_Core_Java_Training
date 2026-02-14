package ExceptionHandling;
import java.util.Scanner;

public class EnterPositiveNumber {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter no : ");
			n = sc.nextInt(); 
		}while(n <= 0);
	}
}
