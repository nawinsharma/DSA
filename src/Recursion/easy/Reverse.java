package Recursion.easy;

public class Reverse {
    static int sum = 0;

    static void reverseOfNum(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseOfNum(n / 10);
    }

    public static void main(String[] args) {
        rev1(12345);
        System.out.println(sum);
    }

    static int rev1(int n) {
        // sometimes u might need some additional variable in the arguments
        // in that case, make another function
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);

    }

    // f(n, arg) = rem*10^(arg-1)+f(n/10,arg-1) 
    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);

    }
}
