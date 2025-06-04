class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length<2){
            return false;
        }
    //     Arrays.sort(nums);
    //     for(int i=1; i<nums.length;i++){
    //         if(nums[i]==nums[i-1]){
    //             return true;
    //         }
    //     }    
    //     return false;
    
    Set<Integer> newSet = new HashSet<>();
    for(int num: nums){
        if(newSet.contains(num)){
            return true;
        }
        newSet.add(num);
    }
    return false;
    //o(n)


    // Set<Integer> numSet = new HashSet<>();
    // for(int num:nums){
    //     numSet.add(num);
    // }
    // return numSet.size() < nums.length;
    }
}