import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Queue");
        QueueX q1 = new QueueX(5);

        q1.insert(10);
        q1.insert(20);
        q1.insert(30);

        q1.display();
        System.out.println("Removed: " + q1.remove());
        q1.display();
        System.out.println("Front Element: " + q1.peekFront());
        System.out.println("Queue Count: " + q1.getCount());

        System.out.println();
        System.out.print("Enter size of circular queue: ");
        int size = sc.nextInt();

        QueueX q2 = new QueueX(size);

        System.out.println("Enter " + size + " values:");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            q2.insert(value);
        }

        q2.display();

        System.out.println("Removed: " + q2.remove());
        System.out.println("Removed: " + q2.remove());

        q2.display();

        System.out.println("Enter 2 new values:");
        q2.insert(sc.nextInt());
        q2.insert(sc.nextInt());

        q2.display();
        System.out.println("Front Element: " + q2.peekFront());
        System.out.println("Queue Count: " + q2.getCount());

        sc.close();
    }
}
