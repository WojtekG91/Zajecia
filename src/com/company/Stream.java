package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Wojtek", "Arek", "oskar", "Dominik", "Leon", "Ewelina", "Janusz");
        Map<Character, List<Person>> grouped = names.stream()
                .filter(s -> s.length() > 4 && s.contains("k"))
                //                .peek(s -> System.out.println(s))
                // .sorted() //sortowanie alfabetyczne, zwrraca strumien z posortowanymi elementami, obiekty sorted musza implementowac comparator
                .sorted((s, s1) -> s.compareToIgnoreCase(s1) * -1) // sortowanie odwrotnie alfabetycznie
                .map(s -> s.replaceFirst((String.valueOf(s.charAt(0))), String.valueOf(Character.toUpperCase(s.charAt(0)))))
                .map(Person::new)
//                .reduce((s, s1) -> new Person(s.getName() + s1.getName(), s.getLastname() + s1.getLastname())) //z 2 obiektów person tworzy jeden (reduce)
//                .get().getName());
//                .forEach(s -> System.out.println(s.getName()));
//                .collect(Collectors.toList()));
                .collect(Collectors.groupingBy(s -> s.getName().charAt(0))); //toList

//        grouped.entrySet().for - szybkie generowanie foreach dla
//        szybkie szablony!!!
//
        for (Map.Entry<Character, List<Person>> characterListEntry: grouped.entrySet()){
                System.out.println(characterListEntry.getKey() + " ");
                for (Person person: characterListEntry.getValue()) {
                    System.out.println(person.getName() + " ");
                }
                System.out.println();
        }

        System.out.println(names.stream()
                .map(s -> (int) s.charAt((s.length() - 1)))
                .reduce((s, s1) -> (s + s1))
                .get());

        System.out.println(names.stream()
                .mapToInt(s -> (int) s.charAt(s.length() - 1))
                .reduce((s, s1) -> (s + s1))
                .getAsInt());

        System.out.println(names.stream()
                .mapToInt(s -> (int) s.charAt(s.length() - 1))
                .sum());

        String name = null;
        Optional<String> optionalName = Optional.ofNullable(name);
        optionalName.ifPresent(s -> System.out.println(s));
        System.out.println(optionalName.orElse("Nie ma imienia"));
//        System.out.println(optionalName.orElseThrow(() -> IllegalStateException));
        System.out.println(optionalName.filter(s -> s.contains("o")).orElse("Nie jest to imie z o"));

        //Zadanie 5. Stwórz listę lat ludzi (List<Integer>) na podstawie listy ludzi

    }
}
