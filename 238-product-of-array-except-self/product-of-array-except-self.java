class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n = nums.length;
        // int[] ans = new int[n];
        // int[] prefix = new int[n];
        // int[] suffix = new int[n];
        // prefix[0] = 1;
        // for(int i = 1; i<n; i++){
        //     prefix[i] = prefix[i-1] * nums[i-1];
        // }
        // suffix[n-1] = 1;
        // for(int j = n - 2; j >= 0; j--){
        //     suffix[j] = suffix[j+1] * nums[j+1];
        // }
        // for(int k = 0; k < n; k++){
        //     ans[k] = prefix[k] * suffix[k];
        // }
        // return ans;

        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
}