package Recursion.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 15, 6, 7 };
        System.out.println(isSorted(nums, 0));
    }

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;

        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
