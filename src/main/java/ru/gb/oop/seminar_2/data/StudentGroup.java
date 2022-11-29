package ru.gb.oop.seminar_2.data;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class StudentGroup {
    private List<Student> students;
    private Teacher teacher;
    private Long id;

    private static AtomicLong groupId = new AtomicLong(0);

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
        this.id = groupId.incrementAndGet();
    }

    public List<? extends User> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public AtomicLong getGroupId() {
        return groupId;
    }

    public void setGroupId(AtomicLong groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                " group №" + this.id +
                ", students=" + this.students +
                ", teacher=" + this.teacher +
                '}';
    }
}
