package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6, 7, 10 };
        System.out.println(BS(nums, 10 , 0, nums.length - 1));
    }

    static int BS(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return BS(arr, target, start, mid - 1);
        } else {
            return BS(arr, target, mid + 1, end);
        }

    }
}
