package com.kalyan.optional;

import com.kalyan.exception.CustomException;
import com.kalyan.service.UserService;
import com.kalyan.user.Address;
import com.kalyan.user.User;

import java.util.List;
import java.util.Optional;

public class OptionalExamples {

    public Optional<User> getUsers() throws CustomException {
        UserService userService = new UserService();
        List<User> users= userService.getUsers();
        return Optional.ofNullable(users.stream()
                .findFirst()
                .orElseThrow(() -> new CustomException("Error Finding "))); //optional expect single user
    }

    public Optional<User> getUserByName(String name){
        UserService userService = new UserService();
        List<User> users = userService.getUsers();
        return users.stream().filter(u->u.getName().equals(name)).findFirst();
    }

    public Optional<User> getUserByAddress(Address address){
        UserService userService = new UserService();
        List<User> users = userService.getUsers();
        return users.stream().filter(u->u.getAddress().equals(address)).findFirst();
    }

}
