package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("User1", "LastName1", (byte) 10);
        userService.saveUser("User2", "LastName2", (byte) 15);
        userService.saveUser("User3", "LastName3", (byte) 20);
        userService.saveUser("User4", "LastName4", (byte) 25);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}