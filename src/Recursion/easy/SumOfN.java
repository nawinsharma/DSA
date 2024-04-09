package Recursion.easy;

public class SumOfN {
    public static void main(String[] args) {
        int ans = calculateSum(5);
        System.out.println(ans);
    }
    static int calculateSum(int n){
      if(n == 0){
        return 0;
      }
      return n+calculateSum(n-1);
    }
}
