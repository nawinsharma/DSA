package BinarySearch;

public class MountainAaray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 4, 2, 1 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of array, it may be the ans but look at the left
                // THIS IS WHY END != -1;

                end = mid;
            } else {
                // you are in ascending part of array,

                start = mid + 1; // coz we know that mid + 1 element is > mid element
            }
        }
        // in the end, start == end pointing to the largest number because of the 2
        // checks above
        // start and end are always trying to find the max element int he above 2 checks
        // hence, when they are pointing to the just one element , that is the max one
        // because that is what checks say
        // more elaboration: at every point of time for start and end , they have the
        // best possible answer till that time
        // if we are saying that only one item is remaining coz of above line that is
        // the best possible ans

        return start; // return start or end , because both are same and peak
    }
}