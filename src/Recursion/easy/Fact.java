package Recursion.easy;

public class Fact {
    public static void main(String[] args) {
        int ans = calculateFac(5);
        System.out.println(ans);
    }
    static int calculateFac(int n){
      if(n<=1){
        return 1;
      }
      return n*calculateFac(n-1);
    }
}
