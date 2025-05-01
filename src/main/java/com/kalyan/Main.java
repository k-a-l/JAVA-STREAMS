package com.kalyan;

import com.kalyan.optional.OptionalExamples;
import com.kalyan.service.UserService;
import com.kalyan.stream.UserStream;
import com.kalyan.user.User;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        UserService userService = new UserService();

        UserStream streamObj = new UserStream();
        OptionalExamples  optionalExamples = new OptionalExamples();

        List<User> users = streamObj.getUsers();
        users.stream().map(u->"Name " + u.getName() +
                "City "+u.getAddress().getCity()).forEach(System.out::println);
        System.out.println("-----------------------/n");

        streamObj.getNamesByCity("Lalitpur").forEach(System.out::println);

        streamObj.getUserByNameAndCity("Bob","Lalitpur").stream().forEach(System.out::println);


    }
}