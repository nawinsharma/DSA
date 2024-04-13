package Recursion.easy;

public class Fibo {
    public static void main(String[] args) {
        // find nth fibonacii number
        System.out.println(Fibo(7 ));

    }
    static int Fibo(int n) {
        // base condition
        if (n < 2) {
            return n; 
        } else {
            return Fibo(n - 1) + Fibo(n - 2);
        }

    }
}
// 0 1 1 2 3 5 8 13
