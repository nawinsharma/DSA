package Basics;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // print number from 1 to 5
        /*
         * syntax of for loop
         * for(initialization; condition; icrement/decrement){
         * //body
         * }
         */
        //
        // for (int i = 0; i < 5; i++) {
        // System.out.println(i + 1);
        // }

        // print numbers from 1 to n
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for(int num = 1; num<=n; num++)
        // {
        // System.out.println(num + " ");
        // }

        // while loops
        /*
         * syntax
         * while(condition){
         * //body
         * }
         */
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }

        // we should use for loop when we know how many time times the loop will run and
        // we should use while loop when we have no idea how many times the loop is
        // going to run

        // do while
        // syntax
        /*
         * do{
         * 
         * } while(condition);
         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n != 100); // 1 to 99

        // do while loop execute the loop at least once because of do line
        // first it execute and the check


    }
}
