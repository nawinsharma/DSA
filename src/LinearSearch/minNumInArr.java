package LinearSearch;

public class minNumInArr {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, };
        System.out.println(min(numbers));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;

    }
}
