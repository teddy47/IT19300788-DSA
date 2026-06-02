import java.util.Scanner;

public class InsertionSort {
    public static int sortAscending(int[] arr) {
        int shifts = 0;

        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
                shifts++;
            }

            arr[i + 1] = key;
        }

        return shifts;
    }

    public static int sortDescending(int[] arr) {
        int shifts = 0;

        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while (i >= 0 && arr[i] < key) {
                arr[i + 1] = arr[i];
                i--;
                shifts++;
            }

            arr[i + 1] = key;
        }

        return shifts;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
