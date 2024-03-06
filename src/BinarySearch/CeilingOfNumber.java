package BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        /*
         * suppose arr = [2,3,5,9,14,16,18];
         * ceiling = smallest element in the array which is greater than the target
         * ceiling(arr, target:14)=14;
         * ceiling(arr, target:15)=16;
         * ceiling(arr, target:4)=5;
         * ceiling(arr, target:9)=9;
         * say target is 8, but target is not in the arr, this problem says that , hey, 8 is not there so return the element ust greater than 8
         * which is in the array
         */
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(Ceiling(arr, 15));


    }
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending order or descending order
        boolean isAsc = arr[start] < arr[end];
// when while loop breaks, start = end + 1;so no ans is found , so next big number ( when no ans is found )is start only
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
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return start;

    }
}
