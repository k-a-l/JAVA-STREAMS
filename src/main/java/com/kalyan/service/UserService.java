package com.kalyan.service;

import com.kalyan.user.Address;
import com.kalyan.user.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class UserService {
    List<User> users = new ArrayList<>();

    public UserService() {
     users = new ArrayList<>(Arrays.asList(
            new User(UUID.randomUUID(), "Alice", "alice@example.com", new Address("Nepal", "Kathmandu", "Bagbazar", "Kathmandu")),
            new User(UUID.randomUUID(), "Bob", "bob@example.com", new Address("Nepal", "Lalitpur", "Jawalakhel", "Lalitpur"))
    ));
     System.out.println(users);
}
public List<User> getUsers() {

    return users;
}


}
