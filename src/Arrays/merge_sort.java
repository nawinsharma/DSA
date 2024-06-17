package Arrays;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] num1 = { 4, 5, 7, 0, 0 };
        int[] num2 = { 1, 10 };
        merge(num1, 3, num2, num2.length);
        System.out.println(Arrays.toString(num1)); // Output should be [1, 4, 5, 7, 10]
    }

    static void merge(int[] num1, int m, int[] num2, int n) {
        // int[] combinedArray = new int[m + n];
        // for (int i = 0; i < m; i++) {
        // combinedArray[i] = num1[i];
        // }
        for (int j = 0; j < n; j++) {
            num1[m + j] = num2[j];
        }
        Arrays.sort(num1);

        // for (int i = 0; i < combinedArray.length; i++) {
        // num1[i] = combinedArray[i];
        // }
        // num1[] = {4,5,7,0,0}
        // num2[] = {1,10}
        // combinedArray = {4,5,7,1,10} -> {1,4,5,7,10}

    }
}
