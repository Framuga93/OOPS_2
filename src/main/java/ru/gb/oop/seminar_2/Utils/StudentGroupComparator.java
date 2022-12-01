package ru.gb.oop.seminar_2.Utils;

import ru.gb.oop.seminar_2.data.Student;
import ru.gb.oop.seminar_2.data.StudentGroup;

import java.util.Comparator;

public class StudentGroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getLastName().equalsIgnoreCase(o2.getLastName())){
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
