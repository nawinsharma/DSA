package Basics;

public class Occurence {
    public static void main(String[] args) {
        // counting occurence
        // 1 8 3 7 3 5 7 2 7 7 is occuring 3 times

        // int arr[] = { 1, 2, 6, 7, 3, 4, 7, 9, 7 };
        // int count = 0;
        // int i = 1;
        // for (i = 1; i <= arr.length - 1; i++) {

        // if (arr[i] == 7) {
        // count++;
        // }
        // }
        // System.out.println(count);

        // n % 10 = last digit

        int n = 1837357277;
        int count = 0;
        while (n > 0) {
            int rem = n % 10; // last digit
            if (rem == 7) {
                count++;
            }
            n = n / 10; // n/=10

        }
        System.out.println(count);

    }

}
