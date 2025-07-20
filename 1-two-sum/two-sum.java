class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (hashmap.containsKey(k)) {
                return new int[] { hashmap.get(k), i };
            }
            hashmap.put(nums[i], i);
        }
        return null;
    }
}