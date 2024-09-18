package StringsLeetcode;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');// 195 adding the ASCII value
        System.out.println("a" + "b");// ab

        System.out.println('a' + 3); // 100 = 97+3
        System.out.println((char) ('a' + 3));// d

        System.out.println("a" + 1); // a1 = int will be converted to Integer wrapper class that will call toString

        System.out.println("nawin" + new ArrayList<>()); // nawin[]

        // System.out.println(new Integer(33) + new ArrayList<>()); // error The
        // operator + is undefined for the argument type(s) Integer, ArrayList<Object>
        System.out.println(new Integer(32) + "" + new ArrayList<>()); // this will work , gives 32[] // this is allowed
                                                                      // in c++ python but not here
        // + operator only works for primitive

        // objects are stored in heap , strings that are not explicitely created new are
        // stored in heap in a pool memory known as string pool
    }
}
