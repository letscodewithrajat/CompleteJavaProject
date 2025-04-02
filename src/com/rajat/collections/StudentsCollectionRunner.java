package com.rajat.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author rajatsrivastava
 **/
class AscendingStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

class AscendingNameStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Ranga"), new Student(5, "Chamki"), new Student(2, "Billa"));

        List<Student> studentsAl = new ArrayList<>(students);
        System.out.println(studentsAl);
        Collections.sort(studentsAl);
        System.out.println("Desc :-" + studentsAl);
        Collections.sort(studentsAl, new AscendingStudentComparator());
        System.out.println("Asc :-" + studentsAl);
        studentsAl.sort(new AscendingNameStudentComparator());
        System.out.println("Name :- " + studentsAl);

    }
}
