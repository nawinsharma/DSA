package StringsLeetcode;

public class Reverse_of_string_in_sentence {
    public static void main(String[] args) {
        String str = "hi my name is nawin";
        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String out = "";
        for (int i = str.length - 1; i > 0; i--) {
            out += str[i] + " ";

        }
        return out + str[0];
    }

}
