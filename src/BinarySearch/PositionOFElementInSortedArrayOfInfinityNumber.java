package BinarySearch;

public class PositionOFElementInSortedArrayOfInfinityNumber {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 8, 10, 14, 17, 18 };
        System.out.println(ans(arr, 10));
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // start with the box of size 2
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            // new end will be previous end + double the size of previous box
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}