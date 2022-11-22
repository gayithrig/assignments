package com.assignments.task3;

public class Exercise3 {
    public static void main(String[] args) {
        int input1 = 500;
        String str_input1 = String.valueOf(input1);
        String str = str = new StringBuilder(str_input1).reverse().toString();
        if (str.equals(str_input1)) {
            System.out.println(input1 + " is Palindrome");
        } else {
            System.out.println(input1 + " is not Palindrome");
        }
    }
}

