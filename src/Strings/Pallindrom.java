package Strings;

public class Pallindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("abcba"));
    }

    static boolean isPalindrom(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        String a = str.toLowerCase();

        for (int i = 0; i < a.length() / 2; i++) {
            int start = i;
            int end = a.length() - i - 1;

            if (a.charAt(start) != a.charAt(end)) {
                return false;
            }

        }
        return true;

    }
}
