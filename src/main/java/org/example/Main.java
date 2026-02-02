package org.example;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" List Example!");
        List<Integer> list = new ArrayList<>(Arrays.asList(3,5,6,7,8,2,8,9,4,10,9));
        List<Integer> newList = new ArrayList<>(Arrays.asList(3,5,546,7543,234));
        List<Integer> list3 =
        //System.out.println(list.size());
        //System.out.println(list);
        //list.forEach(System.out::println);



        list.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println(newList);
        System.out.println("---------------------");
        Optional<Integer> secondLargest=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

       // System.out.println(secondLargest);


    }
}