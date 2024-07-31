package Leetcode.Arrays;

import java.util.Arrays;

public class SortedSquare {

    public static void main(String[] args) {
        int[] num = {-1, -3, 0, 3, 5};
        System.out.println(Arrays.toString(res1(num)));
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

    public static int[] res1(int[] num) {
        // main logic
        // [-4,-1,0,3,10]
        // if num[r] * num[r] > num[l] * num[l]
        //     add(num[r] * num[r]) to our result[]
        //     r--
        // else
        // add(num[l] * num[l]) to our result[]
        // l++

        // res - Sq of individual elem ent
        int n = num.length;
        int[] res = new int[n];
        int ind = n - 1;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int sqOfLeft = num[l] * num[l];
            int sqOfRight = num[r] * num[r];

            if (sqOfRight > sqOfLeft) {
                res[ind] = sqOfRight;
                r--;

            } else {
                res[ind] = sqOfLeft;
                l++;
            }
            ind--;
        }
        return res;
    }
}
