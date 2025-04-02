package com.rajat.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author rajatsrivastava
 **/
public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, int... marks) {
        this.name = name;
        for (int mark : marks) {
            this.marks.add(mark);
        }

    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int totalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum = sum + mark;
        }
        return sum;
    }

    public int maximumOfMarks() {

        return Collections.max(this.marks);
        /*
        int max = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }

        }
        return max;*/
    }

    public int minimumOfMarks() {
        return Collections.min(this.marks);
        /*int min = Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;*/
    }

    public BigDecimal averageOfMarks() {
        int sum = totalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void addNewMark(int mark) {
        this.marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        this.marks.remove(index);
    }
}
