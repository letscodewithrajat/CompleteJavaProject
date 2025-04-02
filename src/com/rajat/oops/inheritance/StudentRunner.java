package com.rajat.oops.inheritance;

/**
 * @author rajatsrivastava
 **/
public class StudentRunner {
    public static void main(String[] args) {
/*
        Student student = new Student();
        student.setName("Ranga");
        System.out.println(student);

        Person person = new Person();
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);

 */
        Employee employee = new Employee("Ranga", "SDE2");
        // employee.setName("Ranga");
        employee.setEmail("ranga@email.com");
        //employee.setTitle("SDE1");
        employee.setEmployerGrade('S');
        System.out.println(employee);
    }
}
