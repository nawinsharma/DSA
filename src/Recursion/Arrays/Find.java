package Recursion.Arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 4, 4, 4, 15, 6, 7 };
        System.out.println(findIndex(nums, 4, 0));
        System.out.println(findIndexLast(nums, 7, nums.length - 1));
        // findAllIndex(nums, 4, 0);
        // System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndexPro(nums, 4, 0, list);
        System.out.println(ans);
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndexPro(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexPro(arr, target, index + 1, list);

    }
}
