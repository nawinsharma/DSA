package Recursion.easy;

public class Concept {
    public static void main(String[] args) {
        fun(6);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // fun(n--);
        // this will pass the value then subtract so it will go in infinite loop printing n
        fun(--n); // wherease this first sub. then pass
    }
}
