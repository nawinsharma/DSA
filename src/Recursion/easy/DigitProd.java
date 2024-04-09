package Recursion.easy;

public class DigitProd {
   
    public static void main(String[] args) {
        int ans = product(3324);
        System.out.println(ans);
    }

    static int product(int n) {
        if (n % 10 == n ) {
            return n;
        }
        int product = ( n % 10) * product(n / 10);
        return product;
    }
}
