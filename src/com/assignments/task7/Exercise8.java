package com.assignments.task7;

import java.util.Random;

public class Exercise8 {
    public static void main(String[] args) {
        int[] a = new int[100];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(99);
            System.out.println(a[i]);
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = max;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
        }
        System.out.println("Max element: " + max);
    }
}


