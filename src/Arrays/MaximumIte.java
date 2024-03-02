package Arrays;

public class MaximumIte {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 2, 6));
    }
    // static int max(int[] arr) {
    // for(int i=0;i<arr.length;i++){
    // for(int j=i+1;j<arr.length;j++){
    // if(arr[i]>arr[j]){
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }
    // }
    // }
    // return arr[arr.length-1];
    // }

    // or
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // for range
    static int maxInRange(int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start + 1; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
