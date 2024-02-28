package Functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean ans = isArmstrong(num);
        System.out.println(ans);

        // print all the 3 digits armstrong numbers
        for (int i = 100; i <= 10000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            // Using the power operator or multiplying rem by itself twice
            sum += Math.pow(rem, 3);
            // sum += rem * rem * rem;
        }

        return sum == original;
    }
}
