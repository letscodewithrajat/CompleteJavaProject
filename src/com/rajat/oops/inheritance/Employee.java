package com.rajat.oops.inheritance;

import java.math.BigDecimal;

/**
 * @author rajatsrivastava
 **/
public class Employee extends Person {

    private String title;
    private String employer;
    private char employerGrade;
    private BigDecimal salary;

    public Employee(String name, String title) {
        // super(); --implicit call
        super(name);
        this.title = title;
        System.out.println("Employee constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public char getEmployerGrade() {
        return employerGrade;
    }

    public void setEmployerGrade(char employerGrade) {
        this.employerGrade = employerGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                " # title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", employerGrade=" + employerGrade +
                ", salary=" + salary
                ;
    }
}
