package com.assignments.task4;

public class Exercise3 {
    static int[] nums;

    public static void main(String[] args) {
        nums = new int[]{2, 3, 4, 5, 6, 6, 7, 8, 8, 0, 9, 0, 9};
        int result = Linear_Search(nums, 5);
        if (result == -1) {
            System.out.print("Not present in the array!");
        } else System.out.print("Number found at index " + result);
    }

    private static int Linear_Search(int[] nums, int search) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == search) {
                return i;
            }
        }
        return -1;
    }
}


