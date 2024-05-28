package Strings;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("nawin");
        System.out.println(new int[] { 1, 2, 3, 4 });
        System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4 }));
        String name = null;
        System.out.println(name);

        // 56
        // nawin
        // [I@7ad041f3
        // [1, 2, 3, 4]
        // null

        // int is a primitive type but Integer is wrapper class

        // In Java, when you create an object using the new keyword, it's allocated on
        // the heap. This means that the memory for the object is dynamically allocated
        // during runtime and managed by the Java Virtual Machine (JVM). Objects on the
        // heap persist until they're no longer referenced and are eventually garbage
        // collected.

        // Strings in Java are a bit special because they are immutable, meaning their
        // values cannot be changed after they are created. Additionally, Java optimizes
        // memory usage for strings by storing them in a special memory area called the
        // "string pool" or "string constant pool". When you create a string literal
        // (e.g., String str = "hello";), if a string with the same value already exists
        // in the string pool, Java doesn't create a new string object; instead, it
        // reuses the existing one. This helps conserve memory and improves performance.

        // However, when you explicitly use the new keyword to create a string object
        // (e.g., String str = new String("hello");), it will create a new string object
        // on the heap regardless of whether the string with the same value already
        // exists in the string pool. This is because new explicitly instructs Java to
        // allocate memory for a new object.

        // In summary:

        // Objects created with new are stored on the heap.
        // Strings created using string literals may be stored in the string pool for
        // optimization.
        // Strings explicitly created with new are always stored on the heap.
    }
}
