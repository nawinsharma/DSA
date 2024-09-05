package Leetcode.String;

public class LongestPallindromSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbc"));
    }

    public static boolean isPallindrom(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        // approach
        // find all the substring
        // then find whether the substring is palindrome or not, if it is then just update the longestPallindrome string by current substring

        int len = s.length();
        String longestPallindromeStr = "";
        for (int i = 0; i < len; i++) {
            String Substr = "";
            for (int j = i; j < len; j++) {
                Substr += s.charAt(j) + "";
            }
            if (isPallindrom(Substr) && Substr.length() > longestPallindromeStr.length()) {
                longestPallindromeStr = Substr;
            }
        }
        return longestPallindromeStr;
    }

    public static String optimized(String s) {
        // logic
        // 1. get the longest odd length palindromic substring O(N^2)
        // 2. get the longest even length palindromic substring O(N^2)
        // 3. get the maximum of above two

        // 2O(N^2) means O(N^2)
        // arr.length O(1)
        // str.lemgth() O(N)
        // 1. get the longest odd length palindromic substring for each i
        int len = s.length();
        String ans = "";
        int maxLength = 0;

        int currLen = 1;
        for (int mid = 0; mid < len; mid++) {
            int i = mid - 1;
            int j = mid + 1;
            while (i >= 0 && j < len && s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                currLen += 2;
            }
            if(currLen > maxLength){
                ans = s.substring(i+1, j);
                maxLength = currLen;
            }
        }

        for(int mid = 0; mid< len; mid++){
            // let i , j be middle element in this case of even no // abba
            int i = mid;
            int j = mid+1;
            while(i>=0 && j<len - 1 && s.charAt(i)==s.charAt(i) ){
                i--;
                j++;
                 currLen+=2;
            }
            if(currLen > maxLength){
                ans = s.substring(i+1, j);
                maxLength = currLen;
            }
        }
        return  ans;
        // O(N * (N+N)) = O(N^2)
    }
}
