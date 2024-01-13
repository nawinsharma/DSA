package Basics;

public class Scope {
    public static void main(String[] args) {
        // anything intialized outside a block , we can not reinitalized inside the
        // block because it is using same reference variable and we can change the
        // original reference variable inside the block
        // but anything is initialized inside the block we can initialized outside a
        // block
        int a = 3;
        int b = 32;
        {
            a = 9; // already initialized outside the block in the same method, hence can not
                   // initaialized again
            System.out.println(a);
            // reassign the origin ref variable to some other value
            int c = 90; // this c only exist for this block only!
            // value initialized in this block will remain in this block only
        }
        int c = 3; // but anything is initialized inside the block we can initialized outside a
                   // block

        // System.out.println(c); // can not use outside the block
        System.out.println(a);
    }
}
