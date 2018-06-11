package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zadanie {
    public static void main(String[] args) {


        List<Person2> persons = new ArrayList<>();
        Person2 person1 = new Person2("Wojtek", "Galka", 27);
        Person2 person2 = new Person2("Arek", "Galka", 25);
        Person2 person3 = new Person2("Jan", "Kowalski", 29);
        Person2 person4 = new Person2("Jarek", "Galka", 35);
        Person2 person5 = new Person2("Jerzy", "Gora", 22);
        Person2 person6 = new Person2("Ewelina ", "Sanka", 25);
        Person2 person7 = new Person2("Bożydar", "Iwanow", 40);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);

        persons.stream()
                .collect(Collectors.groupingBy(s -> s.getSurname()))
                .entrySet()
                .stream()
                .max((s, s1) -> Integer.compare(s.getValue().size(), s1.getValue().size()))
                .ifPresent(s -> System.out.println(s.getKey()));

//        for (Map.Entry<String, List<Person2>> stringListEntry : grouping.entrySet()) {
//            System.out.println(stringListEntry.getKey() + " ");
//            for (Person2 person : stringListEntry.getValue()) {
//                System.out.println(person.getName() + " ");
//            }
//            System.out.println();
//        }
        System.out.println(persons.stream()
                .mapToInt(s -> s.getAge())
                .average());

        //Zadanie 3
        persons.stream()
                .max((s, s1) -> Integer.compare(s.getAge(), s1.getAge()))
                .map(s -> new Person2("Medrzec " + s.getName(), s.getSurname(), s.getAge()))
                .ifPresent(s -> System.out.println(s.getName()));

        //Zadanie 4
        persons.stream()
                .reduce((s, s1) -> new Person2(s.getName() + s1.getName().substring(0, 1).toLowerCase(),
                        s.getSurname() + s1.getSurname().substring(0, 1).toLowerCase(),
                        s.getAge() + s1.getAge()))
                .ifPresent(System.out::println);


    }


}
