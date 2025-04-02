package com.rajat.arrays;

import java.math.BigDecimal;

/**
 * @author rajatsrivastava
 **/
public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student("Ranga", 96, 99, 98);
        Student student1 = new Student("Billa", 96, 99);
        Student student2 = new Student("Chikanna", 96, 99, 98, 23);

        int number = student.getNumberOfMarks();
        System.out.println("Numbers :- " + number);
        int sum = student.totalSumOfMarks();
        System.out.println("Sum :- " + sum);
        int max = student.maximumOfMarks();
        System.out.println("Max :- " + max);
        int min = student.minimumOfMarks();
        System.out.println("Min :- " + min);
        BigDecimal avg = student.averageOfMarks();
        System.out.println("Avg :- " + avg);
        System.out.println(student);

        student.addNewMark(34);
        System.out.println(student);

        student.removeMarkAtIndex(1);
        System.out.println(student);
    }
}
