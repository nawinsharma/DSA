package Functions;

public class Shadowing {
    static int x = 90;  // this will be shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x); //90
        int x ; // the class variable at line 4 is shadowed by this 
        // System.out.println(x);// scope will begin when value is initialized
        x=34;
        System.out.println(x); //34
        fun();
    }
    private static void fun() {
        System.out.println(x);
    }
}
