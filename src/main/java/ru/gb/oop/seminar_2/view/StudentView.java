package ru.gb.oop.seminar_2.view;

import ru.gb.oop.seminar_2.data.StudentGroup;
import ru.gb.oop.seminar_2.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<? extends User> users) {
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (User user : users) {
            log.info(user.toString());
        }
    }

    public void showGroup (List<StudentGroup> group){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudentGroup member : group){
            log.info(member.toString());
        }
    }
}
