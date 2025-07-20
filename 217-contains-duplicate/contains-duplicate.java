class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Set<Integer> set = new HashSet<>();
        // for (int n : nums) {
        //     set.add(n);
        // }
        // return  set.size() < nums.length;

        // if(nums.length<2){
        //     return false;
        // }
        //     Arrays.sort(nums);
        //     for(int i=1; i<nums.length;i++){
        //         if(nums[i]==nums[i-1]){
        //             return true;
        //         }
        //     }    
        //     return false;

        Set<Integer> visited = new HashSet<>();
        for(int num: nums){
            if(visited.contains(num)){
                return true;
            }
            visited.add(num);
        }
        return false;
        //o(n)

    }
}