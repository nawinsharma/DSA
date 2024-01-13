package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 3, 2, 4);
        multiple(3,4,"nawin","iokj");
    }
    private static void multiple(int a,int  b, String ...v){

    }
    private static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

}
