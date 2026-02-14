package DecisionMaking;

import java.util.Scanner;

public class UserSelectsItem {
	public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Menu:");
	        System.out.println("1. Pizza  - ₹200");
	        System.out.println("2. Burger - ₹120");
	        System.out.println("3. Dosa   - ₹80");
	        System.out.println("4. Coffee - ₹50");
	        
	        System.out.print("Select an item: ");
	        int n = sc.nextInt();
	        
	        switch(n) {
	        	case 1:
	        		System.out.println("You selected item 1 Pizza, it's price is ₹200");
	        		break;
	        	case 2:
	        		System.out.println("You selected item 2 Burger, it's price is ₹120");
	        		break;
	        	case 3:
	        		System.out.println("You selected item 3 Dosa, it's price is ₹80");
	        		break;
	        	case 4:
	        		System.out.println("You selected item 4 coffee, it's price is ₹50");
	        		break;
	        	default:
	        		System.out.println("Invalid Selection");
	        		break;
	        }
	        sc.close();
	}
}
