package DecisionMaking;

import java.util.Scanner;

public class UserSelects {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		char ch;
		
		do {
			System.out.print("Choose Operation: ");
			System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
			int choose = sc.nextInt();
			
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			
			switch(choose) {
				case 1:
					System.out.println("Total: "+ (total += num));
					break;
				case 2:
					System.out.println("Total: "+ (total -= num));
					break;
				case 3:
					if(total == 0)
						total = num;
					else
						System.out.println("Total: "+ (total *= num));
					break;
				case 4:
					if(num == 0)System.out.println("Cannot be divided by 0");
					else 
						if(total == 0)total = num;
						else System.out.println("Total: "+ (total /= num));
					break;
				default:
					System.out.println("Invalid Choice");
			}
			System.out.print("Do you want to continue(y/n)?");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}



