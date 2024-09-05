package Leetcode.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // remove duplicates from the sorted array
        int[] arr = {0, 0, 1, 1, 2, 2, 3, 4, 4};
        System.out.println(remove(arr));
    }

    public static int remove(int[] arr) {
        int k = 0;
        int prev = Integer.MIN_VALUE;
        for (int traversalPointer = 0; traversalPointer < arr.length; traversalPointer++) {
            int currentElement = arr[traversalPointer];
            if (prev != currentElement) {
                arr[k] = currentElement;
                k++;
                prev = currentElement;
            }
        }
        return k;
    }

}
