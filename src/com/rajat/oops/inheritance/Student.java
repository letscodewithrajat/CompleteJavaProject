package com.rajat.oops.inheritance;

/**
 * @author rajatsrivastava
 **/
public class Student extends Person {

    private String collegeName;
    private String year;

    public Student(String name, String collegeName) {
        super(name);
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
