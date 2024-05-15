package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 8, 3, 9, 3 }; 
        // System.out.println(searchFromLast(nums, nums.length - 1, 1));
        // searchAllIndex(nums, 0, 3);
        // System.out.println(lst);
        System.out.println(searchAllIndexTarget(nums, 0, 3, new ArrayList<>()));
        System.out.println(searchAllIndexTarget2(nums, 0, 3));

    }

    static int search(int[] arr, int index, int target) {
        if (arr[index] == target) { 
            return index;
        }
        if (arr[index] != target) {
            return search(arr, index + 1, target);
        } else {
            return -1;
        }

    }

    static int searchFromLast(int[] arr, int index, int target) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return searchFromLast(arr, index - 1, target);
        }

    }

    static boolean isTargetPresent(int[] arr, int index, int target) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || isTargetPresent(arr, index + 1, target);
    }

    static ArrayList<Integer> lst = new ArrayList<>();

    static void searchAllIndex(int[] arr, int index, int target) {
        if(index == arr.length){
            return;
        }
        if (arr[index] == target) {
            lst.add(index);
        }
        searchAllIndex(arr, index + 1, target);
    }

    static ArrayList<Integer> searchAllIndexTarget(int[] arr, int index, int target, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
            return searchAllIndexTarget(arr, index+1, target, list);
        }
        return searchAllIndexTarget(arr, index+1, target, list);
    }
    static ArrayList<Integer> searchAllIndexTarget2(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        // this will contain the answer of that fn call only 
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowFnCall =  searchAllIndexTarget2(arr, index+1, target);
        list.addAll(ansFromBelowFnCall);
        return list;
    } 
}