package com.rajat.arrays;

/**
 * @author rajatsrivastava
 **/
public class StringRunner {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String daysWithMostChar = "";
        for (String day : daysOfWeek) {
            if (day.length() > daysWithMostChar.length()) {
                daysWithMostChar = day;
            }
        }
        System.out.println("daysWithMostChar:- " + daysWithMostChar);

        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.println(daysOfWeek[i]);
        }
    }
}
