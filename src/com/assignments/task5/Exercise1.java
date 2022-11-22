package com.assignments.task5;

public class Exercise1 {
    public static void main(String[] args) {
        String str = "Consultadd", nstr = "";
        char ch;
        System.out.print("Original word: ");
        System.out.println("Consultadd");
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed word: " + nstr);
    }
}


