package LinearSearch;

public class MaximumWealth {
    // https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 4, 1}
        };
        System.out.println(MaxWealth(accounts));
    }
    static int MaxWealth(int[][] accounts){
     // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}