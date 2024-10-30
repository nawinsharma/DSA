package hashmap;

import java.util.HashMap;

public class ContigousArray {

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0};
        int ans = Contigous(nums);
        System.out.println(ans);
    }

//     Key Idea
// Count Tracking: The goal is to keep track of the balance between 0s and 1s as we go through the array. Every time we see a 0, we treat it as -1 (subtract 1 from the count). When we see a 1, we treat it as +1 (add 1 to the count).
// HashMap Usage: The HashMap stores each count value we've seen so far and the index where it first appeared. This helps us detect if we've seen the same count before, indicating that the elements between these indices have balanced 0s and 1s.
    public static int Contigous(int[] nums) {

        HashMap<Integer, Integer> counts = new HashMap<>();

        counts.put(0, -1);

        int max_length = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count -= 1;
            } else {
                count += 1;
            }

            if (counts.containsKey(count)) {
                max_length = Math.max(count, i - counts.get(count));
//If count is already in counts: It means we’ve seen this balance before, so the elements between the previous index where this balance was first seen and the current index i form a balanced subarray.
// Calculate the length of this subarray as i - counts.get(count).
// Update max_length if this length is longer than the previous longest balanced subarray.
// If count is not in counts: Store the current index i in counts with the current count. This marks where we first saw this balance.
            } else {
                counts.put(count, i);
            }
        }

        return max_length;
    }
}



// Example Walkthrough
// Given nums = {0, 1, 1, 0}:

// Starting with count = 0.
// Index 0: nums[0] = 0 → count = -1. Add (-1, 0) to counts.
// Index 1: nums[1] = 1 → count = 0. count = 0 was seen before at index -1, so the length is 1 - (-1) = 2.
// Index 2: nums[2] = 1 → count = 1. Add (1, 2) to counts.
// Index 3: nums[3] = 0 → count = 0. count = 0 was seen before at index -1, so the length is 3 - (-1) = 4.
// The longest balanced subarray is {0, 1, 1, 0}, with a length of 4.

// This solution efficiently finds the longest balanced subarray in a single pass with O(n) time complexity, using the HashMap for fast lookups.






