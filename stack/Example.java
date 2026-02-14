package stack;

import java.util.Scanner;
import java.util.Stack;

public class Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        int select;

        do {
            System.out.println("\nChoose operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. IsEmpty");
            System.out.println("5. Search");
            System.out.println("6. Exit");

            select = sc.nextInt();

            switch (select) {

                case 1:
                    System.out.print("Enter element to push: ");
                    stk.push(sc.nextInt());
                    break;

                case 2:
                    if (stk.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Popped element: " + stk.pop());
                    }
                    break;

                case 3:
                    if (stk.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Top element: " + stk.peek());
                    }
                    break;

                case 4:
                    System.out.println(stk.isEmpty()
                            ? "Stack is empty"
                            : "Stack is not empty");
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    int searchElem = sc.nextInt();
                    int pos = stk.search(searchElem);
                    if (pos != -1) {
                        System.out.println("Element found at position (from top): " + pos);
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (select != 6);

        sc.close();
    }
}
