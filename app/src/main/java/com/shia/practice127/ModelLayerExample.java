package com.shia.practice127;

import java.util.ArrayList;
import java.util.List;

public class ModelLayerExample {

    public static List<User> getUsers () {
        List<User> users = new ArrayList<>();
        users.add(new User("Mostafa", "Merati"));
        users.add(new User("Mostafa", "Merati"));
        users.add(new User("Mostafa", "Merati"));
        users.add(new User("Mostafa", "Merati"));
        users.add(new User("Mostafa", "Merati"));

        return users;
    }
}
