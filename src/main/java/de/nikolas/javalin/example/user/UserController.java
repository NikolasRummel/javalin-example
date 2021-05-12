package de.nikolas.javalin.example.user;

import io.javalin.http.Handler;

import java.util.concurrent.CompletableFuture;

/**
 * All rights of this code are reserved to
 *
 * @author CubePixels | Nikolas Rummel
 * @since 12.05.2021, 20:04
 * Copyright (c) 2021
 */

public class UserController implements IUserController {

    @Override
    public Handler createUser() {
        return context -> {
            User user = new User(1, "test");
            context.json(user);
        };
    }

    @Override
    public Handler helloWorld() {
        return context -> context.result(CompletableFuture.supplyAsync(() -> "Hello World"));
    }
}
