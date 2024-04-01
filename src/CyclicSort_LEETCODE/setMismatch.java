package CyclicSort_LEETCODE;

import java.lang.reflect.Array;
import java.util.Arrays;

public class setMismatch {
    public static void main(String[] args) {
        int[] arr = { 1,2,2,4};
        int[] ans = mismatch(arr);
        System.out.println("mismatch number: " + Arrays.toString(ans));
    }
    static int[] mismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i]-1;
            if (arr[i] < arr.length && arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                return new int[] {arr[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
