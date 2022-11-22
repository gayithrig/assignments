package com.assignments.task5;

public class Exercise2 {
    public static void main(String[] args) {
        String str = "Consultadd pvt", nstr = "";
        char ch;
        System.out.print("Original word: ");
        System.out.println("Consultadd pvt");
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed word: " + nstr);
    }
}
