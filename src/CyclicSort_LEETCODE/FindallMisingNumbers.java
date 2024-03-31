package CyclicSort_LEETCODE;
import java.util.ArrayList;
import java.util.List;

public class FindallMisingNumbers {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> missingNumbers = findDisappearedNumbers(arr);
        System.out.println("Missing numbers: " + missingNumbers);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct_index = nums[i] - 1;
            if (nums[i] != nums[correct_index]) {
                swap(nums, i, correct_index);
            } else {
                i++;
            }
        }
        // find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


// Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in
// nums.

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// Example 2:

// Input: nums = [1,1]
// Output: [2]
