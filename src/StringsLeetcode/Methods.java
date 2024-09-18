package StringsLeetcode;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "nawin";

        System.out.println(Arrays.toString(name.toCharArray()));// [n, a, w, i, n]
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('s')); // -1

        String str = "          nskfe       ";
        System.out.println(str.strip());
    }
}
