package Basics;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        /*
        Here , public means this can be accessible to every one
        static means we can execute this main function without creating an object of this class test 
        void means it return nothing
        main is the name of main function
        String args are arguments
        which means
        */
        System.out.println("hi");

        // if we execute by running java Test.java 69 96, we get 69 at index 0 and 96 at index1
        // System.out.println(args[0]);
        // The System class contains several useful class fields and methods. 
        // It cannot be instantiated. 
        // System has variable called out whose type is printstream

        // System: It is a class in the java.lang package. It provides access to system-related parameters and functions.

        // out: It is a static member of the System class and is an instance of the PrintStream class. It is connected to the standard output stream, which is typically the console.
    
        // println: It is a method of the PrintStream class. The println method is used to print a line of text to the console. 
        // It appends a newline character (\n) at the end of the output, so the next output will start on a new line.
        
        // hi
        // System.out.println(args[1]);


        Scanner input = new Scanner(System.in);
        // The Scanner class in Java, which is part of the java.util package, allows you to read input from various sources, such as the console or a file. When combined with System.in, it is commonly used to read input from the standard input stream (keyboard).  
        // Scanner: This is the class in Java that provides methods for parsing input. It can be used to read input of different types, such as integers, floating-point numbers, and strings.

        // input: This is a variable name that you've chosen to represent an instance of the Scanner class. You can use this variable to invoke methods on the Scanner object.
    
        // new Scanner(System.in): This part of the code creates a new Scanner object that is associated with the standard input stream (System.in). System.in represents the input stream typically connected to the keyboard. By creating a Scanner object with System.in, you can use it to read input entered by the user.
       
        System.out.println(input.next());
}
}