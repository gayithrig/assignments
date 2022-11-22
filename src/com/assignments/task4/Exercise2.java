package com.assignments.task4;

public class Exercise2 {
    public static void main(String[] args) {
        double[] numArray = {5.6, 4, 3.5, 10, 7.3, 3.1};
        double sum = 0.0;
        for (double num : numArray) {
            sum += num;
        }
        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}

