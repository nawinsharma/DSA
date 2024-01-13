package Functions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Before swapping num1="+num1+" num2  = "+num2);
        swap(num1, num2);

    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping num1 = "+a+" num2 = "+b);
    }
}
