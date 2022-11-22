package com.assignments.task7;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise2 {
    public static void main(String[] args) {
        String[] firstArray = {"S", "A", "R", "H"};
        String[] secondArray = {"E", "A", "B", "S"};
        HashSet<String> set = new HashSet<>();
        set.addAll(Arrays.asList(firstArray));
        set.retainAll(Arrays.asList(secondArray));
        System.out.println(set);
        String[] intersection = {};
        intersection = set.toArray(intersection);
        System.out.println(Arrays.toString(intersection));
    }
}


