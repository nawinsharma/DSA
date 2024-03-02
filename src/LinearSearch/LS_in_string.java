package LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LS_in_string {
    public static void main(String[] args) {
        String name = "Nawin";
        char target = 'w';
        System.out.println(search(name, target));
        System.out.println(containsChar(name, target));
        System.out.println(containsChar2(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    // search in the string : return the index if found, -1 otherwise
    public static int search(String str, char target) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    // return true if the string contains the target, false otherwise
    static boolean containsChar(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    // return true if the string contains the target using for each, false otherwise
    static boolean containsChar2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
