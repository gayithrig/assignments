package com.assignments.task4;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {10, 20, 30};
        boolean result = Arrays.equals(a, b);
        if (result) {
            System.out.println("Two arrays are equal");
        } else {
            System.out.println("Two arrays are not equal");
        }
    }
}
