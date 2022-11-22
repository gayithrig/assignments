package com.assignments.task5;

public class Exercise7 {
    public static void main(String[] args) {
        String str = "Be Happy and Stay Motivated";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}


