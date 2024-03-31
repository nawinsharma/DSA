package CyclicSort_LEETCODE;

public class Missing_num {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        int missingNumber = missing(arr);
        System.out.println("Missing number: " + missingNumber);
    }

    static int missing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }
        // search for the first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length; // If all elements are in place, return the next number
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}