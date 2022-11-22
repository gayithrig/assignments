package com.assignments.task3;

public class Exercise9 {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 1; i <= size; i++) {
            // printing spaces
            for (int j = size - 1; j >= i; j--) {
                System.out.print(" ");
            }
            // printing star
            for (int k = 0; k < 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= size; i++) {
            // printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // printing star
            for (int k = 0; k < 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}