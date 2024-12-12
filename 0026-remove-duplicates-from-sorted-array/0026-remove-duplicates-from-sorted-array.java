class Solution {
    public int removeDuplicates(int[] nums) {
          int k = 0;
        int prev = Integer.MIN_VALUE;
        for (int traversalPointer = 0; traversalPointer < nums.length; traversalPointer++) {
            int currentElement = nums[traversalPointer];
            if (prev != currentElement) {
                nums[k] = currentElement;
                k++;
                prev = currentElement;
            }
        }
        return k;
    }

}