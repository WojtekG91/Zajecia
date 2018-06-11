package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class ArrayOperations {

    static <T> Collection<T> fromArrayToCollection(T[] t) {
        return new ArrayList<>(Arrays.asList(t));
    }

    static void printList(List<? extends Number> someList) {
        for (Object o : someList){
            System.out.println(o);
        }
    }
}
