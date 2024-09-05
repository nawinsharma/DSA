package Strings;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingChar {

    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char x = 'e';
        System.out.println(find(words, x));
    }

    public static List<Integer> find(String[] words, char x) {
        // Create a dynamic list to store indices of words that contain the character 'x'
        List<Integer> ans = new ArrayList<>();

        // Loop through each word in the words array
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Check if the word contains the character 'x'
            for (char ch : word.toCharArray()) {
                if (ch == x) {
                    // Add the index of the word to the result list
                    ans.add(i);
                    // Break the loop once the character is found to avoid duplicate indices
                    break;
                }
            }
        }
        // Return the list of indices
        return ans;
    }

}

