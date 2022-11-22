package com.assignments.task2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter the character ");
        ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + "is an alphabet ");
        } else {
            System.out.println(ch + "is not  an alphabet ");
        }
    }
}

