package Functions;

public class Overloading {
    public static void main(String[] args) {
        fun(99);
        fun("Nawin");
    }

    static void fun(int a) {
        System.out.println(a);
    }
    // two or more functions having same name but different arguments
    // at compile time
    static void fun(String name) {
        System.out.println(name);
    }
}
