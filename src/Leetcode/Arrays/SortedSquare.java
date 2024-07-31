package Leetcode.Arrays;

import java.util.Arrays;

public class SortedSquare {

    public static void main(String[] args) {
        int[] num = {-1, 3, 5, 2, -9};
        System.out.println(Arrays.toString(res(num)));
    }

    public static int[] res(int[] arr) {
        // bruteforce approach 
        // O(N) + O(N logN) ~ O(N logN)
        int[] sq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sq[i] = arr[i] * arr[i];
        }
        Arrays.sort(sq);
        return sq;
    }

}
