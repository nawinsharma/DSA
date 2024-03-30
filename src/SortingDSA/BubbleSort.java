package SortingDSA;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 8, 6, 5, 3, 9, 0 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at the last respective index
            swapped = false;
            for (int j = 1; j <= arr.length - i - 1; j++) {
                // swap if the item is smaller than the prev one
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;

                }
            }
            // if you just not swap for a particular value of i, it means the array is
            // sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { //run n-1 times
            for (int j = 0; j < arr.length - i - 1; j++) { // run atmost n times
                // time complexity: O(N^2)
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // printArray(arr);
    }

    // static void printArray(int[] arr) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // System.out.print(arr[i]+" ");
    // }
    // System.out.println();
    // }
}
