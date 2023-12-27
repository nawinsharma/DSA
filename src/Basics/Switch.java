package Basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.next();
        int day = sc.nextInt();

        // String a = "Nawin";
        // String b = "Nawin";
        // System.out.println( a == b); // true
        // it means that a and b are pointing to same string Nawinand == checks the
        // reference of the String too

        // System.out.println(a.equals(b)); // true
        // it checks for value

        // switch case
        // In switch statements, you can jump to various cases based on your expression

        // switch (fruit) {

        // case "mango":
        // System.out.println("king of fruit");
        // break;
        // case "apple":
        // System.out.println("Doctors fav fruit");
        // break;
        // case "orange":
        // System.out.println("Smells good");
        // break;
        // case "coconut":
        // System.out.println("refreshing");
        // break;
        // default:
        // System.out.println("Enter a valid fruit");
        // }
        // if break is not provided , all the cases below it will execute

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Doctors fav fruit");
            case "orange" -> System.out.println("Smells good");
            case "coconut" -> System.out.println("refreshing");
            default -> System.out.println("Enter a fruit");
        }

        // switch(day){
        // case 1,2,3,4,5 -> System.out.println("Weekday");
        // case 6,7 -> System.out.println("Weekend");
        // }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");

            default:
                System.out.println("enter a valid day");
        }
    }
}
