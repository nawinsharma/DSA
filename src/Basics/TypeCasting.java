package Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // float num = x.nextFloat();

        // int number = x.nextInt();
        // System.out.println(num);

        // type casting -process of converting one data type to another data type by the
        // programmer
        int r = (int) (343.23f);
        System.out.println(r);

        // automatic tpe promotion in expressions
        // int a = 257;
        // byte b = (byte) (a);// 257%256=1
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c;
        // System.out.println(d);

        // byte i = 50;
        // b = b* 2; //wrong

        // int number = 'A';
        // System.out.println(number);

        /*
         * widening typecasting
         * int x = 7;
         * //automatically converts the integer type into long type
         * long y = x;
         * //automatically converts the long type into float type
         * float z = y;
         * 
         */
        // double -> float -> long -> int -> char -> short -> byte
        // Type promotion automatically promotes the lower range value to higher range
        // value. For example, byte variable can be assigned to an int variable. Here
        // byte variable will be type promoted to int. In case, we want to add two
        // numbers which can be byte, short or int, we can use a single method

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.56f;
        double d = 0.21322;
        double result = (f * b) + (i / c) - (d * s);
        // float + integer - double = double

        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

        int win = 100;

        if (win == 100) {
            System.out.println("You won");
        }
        // int count = 1;
        // while (count != 100) {
        // System.out.println(count);
        // count++;
        // }

        // for loop
        for (int count = 1; count != 4; count++) {
            System.out.println(count);
        }

        
    }
}
