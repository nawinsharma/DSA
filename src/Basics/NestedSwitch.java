package Basics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();

        // switch (empId) {
        // case 1:
        // System.out.println("Nawin");
        // break;
        // case 2:
        // System.out.println("John");
        // break;
        // case 3:
        // System.out.println("employee id is 3");
        // switch (department) {
        // case "IT":
        // System.out.println("IT department");
        // break;
        // case "Civil":
        // System.out.println("cicil department");
        // break;
        // case "management":
        // System.out.println("management department");
        // break;
        // case "nursing":
        // System.out.println("nursing department");
        // break;
        // default:
        // System.out.println("No department");
        // break;
        // }
        // break;
        // case 4:
        // System.out.println("okde");
        // break;
        // default:
        // System.out.println("employee id not found");
        // break;
        // }

        // better way to write
        switch (empId) {
            case 1 -> System.out.println("Nawin");
            case 2 -> System.out.println("John");
            case 3 -> {
                System.out.println("employee id is 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "management" -> System.out.println("management department");
                    default -> System.out.println("No department found");
                }
            }
            case 4 -> System.out.println("fedro");
            default -> System.out.println("enter correct employee id");
        }
    }
}
