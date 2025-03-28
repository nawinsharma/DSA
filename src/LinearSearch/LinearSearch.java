package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int result = search(arr, 4);
        System.out.println("Req target found at index: " + result);
    }
    // search in the array : return the index if found, -1 otherwise
    public static int search(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
      
    }
}
