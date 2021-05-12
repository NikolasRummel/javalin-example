package de.nikolas.javalin.example;

import de.nikolas.javalin.example.user.IUserController;
import de.nikolas.javalin.example.user.UserController;
import io.javalin.Javalin;

/**
 * All rights of this code are reserved to
 *
 * @author CubePixels | Nikolas Rummel
 * @since 12.05.2021, 20:01
 * Copyright (c) 2021
 */

public class WebServer {

    public void start() {
        IUserController userController = new UserController();

        Javalin app = Javalin
                .create()
                .start(7000);

        app.get("/user", userController.createUser());
        app.get("/hello", userController.helloWorld());
    }

    public static void main(String[] args) {
        new WebServer().start();
    }
}
