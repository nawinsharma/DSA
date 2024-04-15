package Recursion.patterns;

public class Triangle {
    public static void main(String[] args) {
        pattern1(3, 0);
    }

    static void pattern(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            pattern(r, c + 1);
        } else {
            System.out.println();
            pattern(r - 1, 0);
        }
        // ****
        // ***
        // **
        // *

    }

    static void pattern1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            pattern1(r, c + 1);
            System.out.print("*");
        } else {
            pattern1(r - 1, 0);
            System.out.println();
        }

        // *
        // **
        // ***

    }
}
