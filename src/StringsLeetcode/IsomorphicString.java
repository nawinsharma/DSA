package StringsLeetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }

    static Boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m = new HashMap<>();

        int n = s.length();
        if (s.length() != t.length()) {

            return false;
        }

        for (int i = 0; i < n; i++) {

            char charS = s.charAt(i);

            char charT = t.charAt(i);

            if (m.containsKey(charS)) {

                if (m.get(charS) != charT)
                    return false;

            }

            else {

                if (m.containsValue(charT))
                    return false;

                m.put(charS, charT);

            }

        }

        return true;

    }

}
// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to
// get t.

// All occurrences of a character must be replaced with another character while
// preserving the order of characters. No two characters may map to the same
// character, but a character may map to itself.