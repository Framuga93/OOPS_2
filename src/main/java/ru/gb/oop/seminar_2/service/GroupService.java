package ru.gb.oop.seminar_2.service;

import ru.gb.oop.seminar_2.data.User;

import java.util.List;

public interface GroupService {

    void createGroup (User user);

    List<User> getAll();

    void deleteUserFromGroup(Long id);

}
