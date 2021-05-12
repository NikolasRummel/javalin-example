package de.nikolas.javalin.example.user;

/**
 * All rights of this code are reserved to
 *
 * @author CubePixels | Nikolas Rummel
 * @since 12.05.2021, 20:03
 * Copyright (c) 2021
 */

public class User {

    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
