package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index

        for(int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);

    }
}
