package Leetcode_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static List<List<Integer>> finalAns = new ArrayList<>();
    public static void main(String[] args) {
        int[]  myList = {1,2,3};  
        List<List<Integer>>  ans = subsets(myList);
        System.out.println(ans);
    }
    public  static void helper(int[] nums, int index, List<Integer> combinationsFormedSOFar){
        //base case      
        if(index == nums.length){
            finalAns.add(new ArrayList<>(combinationsFormedSOFar));
            return;
        }
        // do not pick the currrent element
        helper(nums, index + 1, combinationsFormedSOFar);
        //pick the current element
        combinationsFormedSOFar.add(nums[index]);
        helper(nums, index + 1, combinationsFormedSOFar);
        combinationsFormedSOFar.remove(combinationsFormedSOFar.size()-1);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        helper(nums,0,new ArrayList<>());
        return finalAns;    
    }
}
