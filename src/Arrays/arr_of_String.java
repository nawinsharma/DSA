package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arr_of_String {
    public static void main(String[] args) {
        // Arrays of objects
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();

        }
        System.out.print(Arrays.toString(str));
    }
}
