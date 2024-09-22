package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringCharacter {

    public static void main(String[] args) {
        String str = "abcaabbbc";
        System.out.println(maxOccuringChar(str));
    }

    static char maxOccuringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return maxChar;
    }
}
