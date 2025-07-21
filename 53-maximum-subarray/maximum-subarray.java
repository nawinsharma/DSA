class Solution {
    // Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int max_so_far = nums[0];
        int current_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current_sum = Math.max(nums[i], nums[i] + current_sum);
            max_so_far = Math.max(max_so_far, current_sum);
        }
        return max_so_far;
    }
}