package com.assignments.task5;

public class Exercise6 {
    public static void main(String[] args) {
        String txt = "Iam good";
        String str1 = "Iam";
        String str2 = "good";
        boolean result = txt.contains(str1);
        if (result) {
            System.out.println(str1 + " is present in the string.");
        } else {
            System.out.println(str1 + " is not present in the string.");
        }
        result = txt.contains(str2);
        if (result) {
            System.out.println(str2 + " is present in the string.");
        } else {
            System.out.println(str2 + " is not present in the string.");
        }
    }
}

