package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6};
        System.out.println(Arrays.toString(Hashmap(arr, 11)));
    }

    public static int[] BruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] Hashmap(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int y = target - x;
            if (map.containsKey(y)) {  
                // complexity o(n) // if(map.get(y)!= null)
                return new int[]{i, map.get(y)};
            }
            map.put(x, i);
        }
        return new int[]{};
    }
}
