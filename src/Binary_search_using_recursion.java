public class Binary_search_using_recursion {
    public static void main(String[] args) {

        int nums[] = {2, 3, 4, 5, 6};
        int target = 5;
        int result = Binary_search(nums,0,nums.length -1, target);

        if (result != -1)
            System.out.println("target found at index: " + result);
        else
            System.out.println("element not found");
    }
            public static int Binary_search(int nums[],int left, int right,  int target) {

                if (left<=right){
                    int mid = (left + right)/2;
                    if(nums[mid]==target){
                        return mid;

                    }
                    else if (nums[mid]<target){

                        return Binary_search(nums, mid+1, right, target);
                    }
                    else{
                        return Binary_search(nums,left, mid - 1, target);
                    }

                }

                return -1;
            }
        }

