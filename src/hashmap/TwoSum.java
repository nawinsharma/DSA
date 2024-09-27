package hashmap;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6};
        System.out.println(Arrays.toString(BruteForce(arr, 11)));
        
    }
    public static int[] BruteForce(int[] arr, int target){
        for(int i = 0 ; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
                return new int[]{};
    }
}
