package ru.gb.oop.seminar_2.controller;

import ru.gb.oop.seminar_2.data.Student;
import ru.gb.oop.seminar_2.data.User;
import ru.gb.oop.seminar_2.service.UserService;
import ru.gb.oop.seminar_2.view.StudentView;

import java.util.List;

public class Controller {

    private final UserService userService = new UserService();

    private final StudentView studentView = new StudentView();

    public void createUser (String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

}
