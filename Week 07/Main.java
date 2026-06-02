import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        BubbleSort bs = new BubbleSort();

        System.out.print("Before sorting: ");
        bs.display(arr);

        bs.sort(arr);

        System.out.print("After sorting: ");
        bs.display(arr);

        System.out.println("Time Complexity: O(n^2)");

        sc.close();
    }
}
