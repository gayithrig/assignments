package com.assignments.task5;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        String str;
        int i;
        int length;
        int[] counter = new int[300];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        str = scanner.nextLine();
        length = str.length();
        for (i = 0; i < length; i++) {
            counter[str.charAt(i)]++;
        }
        for (i = 0; i < 300; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }
}



