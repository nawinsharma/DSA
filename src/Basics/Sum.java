package Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter another number");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("your sum is : " + sum);
    }
}
