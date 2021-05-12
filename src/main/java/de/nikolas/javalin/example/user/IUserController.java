package de.nikolas.javalin.example.user;

import io.javalin.http.Handler;

/**
 * All rights of this code are reserved to
 *
 * @author CubePixels | Nikolas Rummel
 * @since 12.05.2021, 20:17
 * Copyright (c) 2021
 */

public interface IUserController {

    Handler createUser();
    Handler helloWorld();
}
