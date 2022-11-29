package ru.gb.oop.seminar_2.service;

import ru.gb.oop.seminar_2.data.Student;
import ru.gb.oop.seminar_2.data.StudentGroup;
import ru.gb.oop.seminar_2.data.Teacher;
import ru.gb.oop.seminar_2.data.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class StudentGroupService{
    private final List<StudentGroup> group;

    public StudentGroupService() {
        this.group = new ArrayList<>();
    }

    public void createGroup(Teacher teacher, List<Student> students) {

        this.group.add(new StudentGroup(teacher,students));
    }


    public List<StudentGroup> getAll() {

        return this.group;
    }


    public void deleteUserFromGroup(Long id) {

    }

    @Override
    public String toString() {
        return "StudentGroupService{" +
                "group=" + group +
                '}';
    }
}
