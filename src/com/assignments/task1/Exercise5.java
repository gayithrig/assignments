package com.assignments.task1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius:");
        Double r = s.nextDouble();
        Double area = (3.14 * r * r);
        System.out.println("Area of Circle is: " + area);
    }
}


