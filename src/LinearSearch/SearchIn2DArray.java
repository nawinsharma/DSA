package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9, 10 },
        };
        int target = 10;
        int[] result = search(arr, target);
        System.out.println(Arrays.toString(result));
        System.out.println(max(arr));


        // ranges of inMAX_VALUEteger class
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int cols = 0; cols < arr[row].length; cols++) {
                if (arr[row][cols] == target) {
                    return new int[] { row, cols };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        // for (int row = 0; row < arr.length; row++) {
        // for (int cols = 0; cols < arr[row].length; cols++) {
        // if (arr[row][cols] > max) {
        // max = arr[row][cols];
        // }
        // }
        // }
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
