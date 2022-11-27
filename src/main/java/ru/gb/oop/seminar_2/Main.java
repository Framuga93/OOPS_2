package ru.gb.oop.seminar_2;

import ru.gb.oop.seminar_2.controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createUser("Name",
                "LastName",
                "Patronic");
    }
}