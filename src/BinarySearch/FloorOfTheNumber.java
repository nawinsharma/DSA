package BinarySearch;

public class FloorOfTheNumber {
    public static void main(String[] args) {
        /*
         * floor= greatest number which is less than or = target element
         * ex: arr = [2,3,5,9,14,16,18]
         * floor of 15 is 14
         */
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(Floor(arr, 15));
    }

    // return the index: greatest number <= target
    static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return end;
    }
}
