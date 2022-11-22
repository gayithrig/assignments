package com.assignments.task2;

public class Exercise7 {
    public static int calculateBill(int units) {
        if (units <= 60) {
            return units * 10;
        } else if (units <= 90) {
            return units * 10;
        } else if (units <= 120) {
            return (100 * 10) + (120 - 100) * 15;
        } else if (units > 300) {
            return (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25;
        }
        return 0;
    }

    public static void main(String[] args) {
        int units = 250;
        System.out.println(calculateBill(units));
    }
}


