package Leetcode.Arrays;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 7, 0, 0};
        int[] nums2 = {1, 10};
        optimizedMerge(nums1, 3, nums2, 2);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // brute force
        // example
        // nums1 = [4,5,7,0,0] has a length if m + n , int his case m =3, and n=2
        // nums2 = [1,10]
        // combinedArray = [4,5,7,1,10] =  [1,4,5,7,10]

        // time complexity = O(M) + O(N) + O(M+N)log(M+N ) + O(M+N) ~ O(M+N)log(M+N )
        // space complexity = O(M+N)
        // O(1) < O(log N) < o(N) < o(N logN) <o(N^2) < O(N!)
        int[] combinedArray = new int[m + n];
        for (int i = 0; i < m; i++) {
            combinedArray[i] = nums1[i];
        }
        for (int j = 0; j < n; j++) {
            combinedArray[m + j] = nums2[j];
        }
        Arrays.sort(combinedArray);
        for (int i = 0; i < combinedArray.length; i++) {
            nums1[i] = combinedArray[i];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        // nums1 = [4,5,7,0,0], utilize the extra 2 zero to merge it in nums2
        // nums2 = [1,10]
        for (int j = 0; j < n; j++) {
            nums1[m + j] = nums2[j];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
        // time complexity =  O(N) + O(M+N)log(M+N )~ O(M+N)log(M+N )
        // space complexity = O(1)
    }

    public static void optimizedMerge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 = [11,22,33] nums2=[12,23,45,49]
        // there will be 2 pointer in which if min(min(nums1) and  min(nums2)) comes at first place and from where it comes , the pointer moves on and compare other two
        // 11 is added in forst place and pointer l will move to 22 l++ and compare 22 from nums1 and 12 from nums2  and so on
        // combinedsorted = [ , , , , , ]
        // time complexity =  O(M+N) we are just traversing both array
        // this is with extra space 

        // example
        // nums1 = [4,5,7,0,0] has a length if m + n , int his case m =3, and n=2
        // nums2 = [1,10]
        // filling from the last of nums1 will helps to get res without extra space so pointing p and q to the greatest no of the array and then fill the nums1 zero with gratest
        // nums1 = [4,5,7,0,0]
        //              p   r
        //      nums2 = [1,10]
        //                  q 
        int p = m - 1;
        int q = n - 1;
        int r = nums1.length - 1;
        while (r >= 0) {
            if (q < 0) {
                break;
            }
            if (p >= 0 && nums1[p] >= nums2[q]) {
                nums1[r--] = nums1[p--];
            } else {
                nums1[r--] = nums2[q--];

            }
        }
        System.out.println(Arrays.toString(nums1));

    }
}
