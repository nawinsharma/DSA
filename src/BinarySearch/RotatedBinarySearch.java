package BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        // System.out.println(findPivot(arr)); // 3 returns the index of pivot element
        System.out.println(search(arr, 5));
    }

    static int search(int[] array, int target){
        int pivot = findPivot(array);
        // if you didn't find pivot, means the array is not rotated
        if(pivot == -1){
            // just do normal BS
            binarySearch(array, target, 0, array.length - 1);
        }
        // if the pivot is found, you have 2 sorted arrays
        if(array[pivot] == target){
            return pivot;
        }
        if(target>=array[0]){
            return binarySearch(array, target, 0, pivot-1);
        }
        return binarySearch(array, target, pivot+1, array.length-1);

    }
// this will not work for duplicate value;
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;

            }
            // case 3
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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
