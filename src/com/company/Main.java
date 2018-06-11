package com.company;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pg = new Pair<>("Jan", 3);
        System.out.println(pg.getFirst() + " " + pg.getLast());
        String name = pg.getFirst();
        int m = pg.getLast();
        pg.setFirst(name + " Kowalski");
        pg.setLast(m+1);
        System.out.println(pg.getFirst() + " " + pg.getLast());

        Integer cos = 5;
        sum("Oskar");
        sum(5);
        sum(5.2f);

        Integer[] t = {1, 2, 3};

        System.out.println(ArrayOperations.fromArrayToCollection(t));
    }

    public static <T> T[] sum(T ... numbers){
        System.out.println(numbers);
        return numbers;
    }


}
