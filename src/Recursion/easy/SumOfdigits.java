package Recursion.easy;

public class SumOfdigits {
    public static void main(String[] args) {
        int ans = sum(3324);
        System.out.println(ans);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = ( n % 10) + sum(n / 10);
        return sum;
    }
}
