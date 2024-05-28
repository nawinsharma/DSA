package Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4 };
        System.out.println(check(arr));
    }

    static boolean check(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
