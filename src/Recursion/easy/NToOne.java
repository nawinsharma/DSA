package Recursion.easy;

public class NToOne {
    public static void main(String[] args) {
        funBoth(5);
    }

    static void printNtoOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNtoOne(n - 1);
    }
    static void onetoN(int n) {
        if (n == 0) {
            return;
        }
        onetoN(n - 1);
        System.out.println(n);
    }
    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }
}
