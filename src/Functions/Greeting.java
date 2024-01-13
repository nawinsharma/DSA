package Functions;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String result = greet(name);
        System.out.println(result);
    }

    static String greet(String name) {
        String greeting = "Namaste "+name;
        return greeting;
    }
}
