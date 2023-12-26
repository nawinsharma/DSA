package Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ans = 0;
        while (true) {
            // Take input from user till user does not press X or x
            System.out.println("Enter a operator: ");
            char operator = sc.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.println("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (operator == '+') {
                    ans = num1 + num2;
                }
                if (operator == '-') {
                    ans = num1 - num2;
                }
                if (operator == '*') {
                    ans = num1 * num2;
                }
                if (operator == '/') {
                    if (num2 != 0) {

                        ans = num1 / num2;
                    }
                }
                if (operator == '%') {
                    ans = num1 % num2;
                }

            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid operations");
            }

            System.out.println(ans);
        }

    }
}
