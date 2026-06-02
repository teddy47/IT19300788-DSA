import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        stackx stack = new stackx(5);

        System.out.println("Stack operations");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("Reversed string: " + stackx.reverseString(text));

        System.out.print("Enter parentheses string: ");
        String brackets = sc.nextLine();
        System.out.println("Balanced: " + stackx.isBalanced(brackets));

        sc.close();
    }
}
