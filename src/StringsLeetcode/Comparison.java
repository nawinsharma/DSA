package StringsLeetcode;

public class Comparison {
    public static void main(String[] args) {
        String a = "nawin";
        System.out.println(a);
        a = "Sharma";
        System.out.println(a);
        // nawin sharma

        String str1 = "nawin";
        String str2 = "nawin";
        // == this is a comparotor ,  .equals is a method
        System.out.println(str1 == str2); // true //same string pool

        String name1 = new String("Nawin");
        String name2 = new String("Nawin");
        System.out.println(name1 == name2); // false
        // only check for values
        System.out.println(name1.equals(name2));// true

        System.out.println(name1.charAt(0));//N

    }
}
