package com.assignments.task2;

public class Exercise8 {
    static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) return n;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1]) temp[j++] = arr[i];
        temp[j++] = arr[1];
        if (j >= 1) System.arraycopy(temp, 0, arr, 0, j);
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 4, 4, 4, 11, 11, 11, 11};
        int n = arr.length;
        n = removeDuplicates(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}


