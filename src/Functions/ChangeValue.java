package Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {12,23,45,32,24};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=1000;
        // if we make a change to the object via this reference variable, same obj will be changed
    }
    
}
