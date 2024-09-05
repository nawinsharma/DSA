package Leetcode.Arrays;

import java.util.Arrays;

public class Segregate0and1 {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 1, 0, 1, 1};
        segregeate(arr);
    }

    // time complexity: O(N)
    public static void segregeate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            // Array is empty or has only one element, no need to process
            System.out.println(Arrays.toString(nums));
            return;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Find the next 1 from the left side
            while (left < nums.length && nums[left] == 0) {
                left++;
            }
            // Find the next 0 from the right side
            while (right >= 0 && nums[right] == 1) {
                right--;
            }
            // Swap 0 at left with 1 at right
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}
