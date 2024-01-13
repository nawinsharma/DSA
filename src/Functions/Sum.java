package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // take input of 2 numbers and print the sum

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
         System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int result = addition(a, b);
        // passing the value of the reference variable a,b to addition function
        System.out.println("Sum is : "+result);

    }
    public static int addition(int a, int b){
        return a+b;
    }
}
