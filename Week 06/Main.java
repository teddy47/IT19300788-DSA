import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(149, "Anusha");
        tree.insert(167, "Kosala");
        tree.insert(47, "Dinusha");
        tree.insert(66, "Mihiri");
        tree.insert(159, "Jayani");
        tree.insert(118, "Nimal");
        tree.insert(195, "Nishantha");
        tree.insert(34, "Avodya");
        tree.insert(105, "Bimali");
        tree.insert(133, "Sampath");

        System.out.println("InOrder Traversal:");
        tree.inOrder();

        System.out.println("\nPreOrder Traversal:");
        tree.preOrder();

        System.out.println("\nPostOrder Traversal:");
        tree.postOrder();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter employee number to search: ");
        int empNum = sc.nextInt();
        Node found = tree.findRecursive(empNum);
        if (found != null) {
            System.out.println("Employee found:");
            found.displayNode();
        } else {
            System.out.println("Employee not found.");
        }

        tree.deleteAll();
        System.out.println("\nTree after deleting all nodes:");
        tree.inOrder();
        System.out.println("Tree is empty.");

        sc.close();
    }
}
