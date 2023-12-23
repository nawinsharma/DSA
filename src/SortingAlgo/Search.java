package SortingAlgo;

public class Search {

//    Time Complexity
//    measure of how the running time of an algorithm
//    increases with the size of the input data
//    O(N) for linear and O(log N) for binary search


    public static void main(String[] args) {
        int nums[] = {2,3,4,5,6};
        int target = 5;
        int result1 = Linear_search(nums, target);
        int result2 = Binary_search(nums, target);

        if (result1 != -1)
            System.out.println("target found at index: "+result1);
        else
            System.out.println("element not found");
    }

    public static int Linear_search(int nums[], int target){
        int steps = 0;
        for (int i=0; i<nums.length ;i++){
            steps ++;
            if (nums[i] == target){
                System.out.println("total steps taken by Linear search is "+steps);
                return i;
            }

        }
        return -1;

    }
    public static int Binary_search(int nums[], int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left<=right){
            int mid = (left + right)/2;
            steps++;
            if(nums[mid]==target){
                System.out.println("total steps taken by Binary search is "+steps);

                return mid;

            }
            else if (nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid - 1 ;
            }

        }

        return -1;
    }
}
