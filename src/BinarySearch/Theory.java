package BinarySearch;

public class Theory {
    public static void main(String[] args) {
        // steps for Binary Search
        /*
         * 1. find the middle element from sorted array
         * 2. if target is greater than middle element, then search in the right else
         * search in the left
         * 3. if target is equal to middle element, then return the index of middle
         * element
         */
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Search(arr, 4));

    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;

    }
}
