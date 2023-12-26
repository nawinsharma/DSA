package Basics;

public class Conditional {
    public static void main(String[] args) {
        /*
         * Syntax of if statement
         * if(boolean expression T or F, conditions){
         * //body
         * }else{
         * // do this
         * }
         */
        int salary = 23000;
        if (salary > 25000) {
            salary += 10000;
        } else {
            salary += 50000;
        }
    System.out.println(salary);
    }

}
