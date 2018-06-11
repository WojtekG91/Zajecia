package com.company.ZadaniaStream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Czlowiek> ludzie = new ArrayList<>();
        List<Czlowiek> ludzie1 = new ArrayList<>();
        ludzie.add(new Czlowiek("Wojtek", "Gałka", 6));
        ludzie.add(new Czlowiek("Areke", "Gałka", 29));
        ludzie.add(new Czlowiek("Ewelina", "Sanka", 7));
        ludzie.add(new Czlowiek("Ewelina", "Sanka", 25));
        ludzie.add(new Czlowiek("Teresa", "Kowal", 40));
        ludzie.add(new Czlowiek("Jan", "Kowalski", 50));


//        5. Stwórz listę lat ludzi (List<Integer>) na podstawie listy ludzi
        List<Integer> lata = ludzie.stream()
                .mapToInt(s -> s.getAge()).boxed()
                .collect(Collectors.toList());

        for (int s : lata) {
            System.out.println(s);
        }

//        6.  Znajdź człowieka, którego suma cyfr lat jest taka sama jak suma liter w imieniu
        ludzie.stream()
                .filter(s -> s.getName().length() == s.getAge())

//        7. Posortuj ludzi po wieku od najstarszego do najmłodszego
        System.out.println(ludzie.stream()
                .sorted(Comparator.comparing(Czlowiek::getAge))
                .collect(Collectors.toList()));

//        8. Usuń ludzi ze zbioru, którzy występują podwójnie (są zdublowani). Następnie podaj ile takich ludzi było. (istnieje do tego metoda, przeszukaj dokumentacje)
        System.out.println(ludzie.stream()
//                .filter()
//                .sorted(Comparator.comparing(Czlowiek::getAge))
//                .distinct()  //nie ma zapewnionej stabilności przy wyszukiwani w nieposortowanej liscie
                .collect(Collectors.toList()));

        int duplikaty = ludzie.size() - ludzie1.size();
        System.out.println(duplikaty);

//        9. Utwórz klasę Animal, z polami wiek i imię. Na podstawie zbioru ludzi, utwórz zbiór zwierząt. Zwierzę przejmuje imię
//          po złączeniu imienia i nazwiska człowieka, a wiek zwierzęcia to wiek człowieka podzielony przez 10
        System.out.println(ludzie.stream()
                .map(s -> new Animal(s.getName() + s.getSurname(), (s.getAge() / 10)))
                .collect(Collectors.toList()));

//        10. Zamień wiek człowieka na psie lata, (n * 6 - 2), wyświetl tych ludzi, których wiek przekracza 50 lat po zmianie
        System.out.println(ludzie.stream()
                .map(s -> new Czlowiek(s.getName(), s.getSurname(), s.getAge() * 6 - 2))
                .filter(s -> s.getAge() > 50)
                .collect(Collectors.toList()));

//        11. Zgrupuj ludzi, których suma liter w imieniu i nazwisku jest taka sama
        ludzie.stream()
                .filter(s-> s.getName().length() == s.getSurname().length())
                .collect(Collectors.toList())
                .forEach(s -> System.out.println(s));

    }

}
