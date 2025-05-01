package com.kalyan.stream;

import com.kalyan.service.UserService;
import com.kalyan.user.Address;
import com.kalyan.user.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class UserStream {

    public List<User> getUsers() {
        UserService userService = new UserService();
//        List<User> collect = userService.getUsers().stream().collect(Collectors.toList());
//        return collect;
        return  userService.getUsers();
    }

    public List<Address> getAddress() {
        UserService userService = new UserService();
        List<User> users = userService.getUsers();
        return users.stream().map(User::getAddress).collect(Collectors.toList());

    }

    public List<User> getUserByName(String name) {
        UserService userService = new UserService();
        List<User> users= userService.getUsers();
        return users.stream()
                .filter(user->user.getName()
                        .equals(name)).collect(Collectors.toList());

    }

    public List<Address> getAddressByName(String name){
        UserService userService = new UserService();
        List<User> users = userService.getUsers();
        return users.stream()
                .filter(u->u.getName().equalsIgnoreCase(name))
                .map(User::getAddress)
                .collect(Collectors.toList());
    }

    public List<String> getNamesByCity(String city) {
        UserService userService = new UserService();
        List<User> users = userService.getUsers();

        return users.stream()
                .filter(u -> u.getAddress().getCity().equalsIgnoreCase(city))
                .map(User::getName)
                .collect(Collectors.toList());
    }

    public List<User> getUserByNameAndCity(String name,String city) {
        UserService userService = new UserService();
        List<User> users = userService.getUsers();
        return users.stream()
                .filter(u->u.getName().equals(name) && u.getAddress().getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }
}
