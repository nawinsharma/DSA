package hashmap;

import java.util.HashMap;

public class Subarraywithsumk {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, -1, 2};
        int k = 5;
        int count = hashmap_approach(nums, k);
        System.out.println("Number of subarrays with sum " + k + " is: " + count);
    }

    public static int hashmap_approach(int[] nums, int k) {
        HashMap<Integer, Integer> sumFrequencyMap = new HashMap<>();
        sumFrequencyMap.put(0, 1); 
        int cumulativeSum = 0;
        int count = 0;

        for (int num : nums) {
            cumulativeSum += num;

            if (sumFrequencyMap.containsKey(cumulativeSum - k)) {
                count += sumFrequencyMap.get(cumulativeSum - k);
            }

            sumFrequencyMap.put(cumulativeSum, sumFrequencyMap.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }
}
