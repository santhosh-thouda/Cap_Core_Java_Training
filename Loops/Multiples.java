package Loops;

public class Multiples {
	//multiples of 3 and 5 both
	
	public static void main(String[]args) {
		int i = 0;
		int num = 1;
		while(i < 10) {
			if(num % 3 == 0 && num % 5 == 0) {
				System.out.println(num);
				i++;
			} 
			num++;
		}
	}
}
