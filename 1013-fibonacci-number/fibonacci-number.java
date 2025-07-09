class Solution {
    public int fib(int n) {
        // fuck it :)
        return (int) Math.round(Math.pow((1 + Math.sqrt(5)) / 2, n) / Math.sqrt(5));

        // if (n < 2) {
        //     return n;
        // }
        // return fib(n - 1) + fib(n - 2);
    }
}