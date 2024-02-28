package Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // Q. store 5 id
        int id1 = 23;
        int id2 = 24;
        int id3 = 25;
        int id4 = 26;
        int id5 = 27;

        // Array syntax

        // datatype [] variable_name = new datatype[size];
        // int [] id = new int[5];
        // or directly
        // int [] ids = {23,24,25,26,27};

        int [] id; //decaration of array, id is getting defined in the stack
        id = new int[5]; // initialization :actually here object is being created in the memory (heap)
        // System.out.println(id[2]);//0

        String[] arr = new String[4];
        // System.out.println(arr[0]);// null , null is a literal
        // by default, reference variables points to null

        String str = null;
        // int num = null // error we can not assign to primitive types
        //None in python



    }
}
