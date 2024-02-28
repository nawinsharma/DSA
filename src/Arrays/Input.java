package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // array of primitive
        int[]arr = new int[5];
        arr[0] = 23;
        arr[1] = 24;
        arr[2] = 25;
        arr[3] = 26;
        arr[4] = 27;

        // [23,24,25,26,27]
        // System.out.println(arr[4]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    //     for (int i = 0; i <arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    
    // }
// for(int num: arr){ // for every element in array, print the elements
//     System.out.print(num + " "); // here num represents elements of the array
// }
// System.out.println(arr[5]);//index bound of the array


System.out.println(Arrays.toString(arr));
}
}
