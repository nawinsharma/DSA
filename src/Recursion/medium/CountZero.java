package Recursion.medium;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(Count(1302304030, 0));
    }

    static int Count(int nums, int c) {
        if (nums ==  0) {
            return c;
        }
        if (nums % 10 == 0) {
            return Count(nums / 10, c + 1);
        } else {
            return Count(nums / 10, c);
        }
     }
}
