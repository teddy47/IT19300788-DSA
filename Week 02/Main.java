import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ascending = arr.clone();
        int[] descending = arr.clone();

        int shiftsAscending = InsertionSort.sortAscending(ascending);
        int shiftsDescending = InsertionSort.sortDescending(descending);

        System.out.print("Ascending order: ");
        InsertionSort.printArray(ascending);

        System.out.print("Descending order: ");
        InsertionSort.printArray(descending);

        System.out.println("Number of shifts in ascending sort: " + shiftsAscending);
        System.out.println("Number of shifts in descending sort: " + shiftsDescending);

        sc.close();
    }
}
