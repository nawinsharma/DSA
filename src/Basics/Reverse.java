package Basics;

public class Reverse {
    public static void main(String[] args) {
        // reverse of a number
        // n = 23598 => 89532

        int n = 23598;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;

        }
        System.out.println(ans);
    }
}
