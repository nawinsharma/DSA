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
        // Map to store (cumulative sum, frequency of the sum)
        HashMap<Integer, Integer> sumFrequencyMap = new HashMap<>();
        sumFrequencyMap.put(0, 1); // To handle cases where the subarray starts from index 0

        int cumulativeSum = 0;
        int count = 0;

        for (int num : nums) {
            cumulativeSum += num;

            // Check if there's a subarray ending at this index with sum k
            if (sumFrequencyMap.containsKey(cumulativeSum - k)) {
                count += sumFrequencyMap.get(cumulativeSum - k);
            }

            // Update the frequency of the cumulative sum
            sumFrequencyMap.put(cumulativeSum, sumFrequencyMap.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }
}
