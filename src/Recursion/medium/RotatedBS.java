package Recursion.medium;

public class RotatedBS {
    public static void main(String[] args) {
        // arr = {5,6,7,8,1,2,3}
        int[] arr = { 5, 6, 7, 8, 1, 2, 3 };
        System.out.println(search(arr, 2, 0, arr.length - 1));
    }

    // static int search(int[] arr, int target, int s, int e) {
    // if (s > e) {
    // return -1;
    // }
    // int m = s + (e - s) / 2;
    // if (arr[m] == target) {
    // return m;
    // }
    // if (arr[s] <= arr[m]) {
    // if (target >= arr[s] && target <= arr[m]) {
    // // search e=m-1
    // return search(arr, target, s, m - 1);
    // } else {
    // // s = m+1
    // return search(arr, target, m + 1, e);
    // }
    // }
    // if (target >= arr[m] && target <= arr[e]) {
    // return search(arr, target, m + 1, e);
    // }
    // return search(arr, target, s, m - 1);

    // }
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (arr[s] <= target && arr[e] >= target) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }

         }
        if (target > arr[m] && target < arr[e]) {
            return search(arr, target, m + 1, e);
        } else {
            return search(arr, target, s, m - 1);
        }
    }
}
