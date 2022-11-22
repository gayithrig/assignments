package com.assignments.task6;

class Student {
    String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }
}

class Exercise4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.name);
        Student student2 = new Student("Gayithri");
        System.out.println(student2.name);
    }
}