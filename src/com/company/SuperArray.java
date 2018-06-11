package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class SuperArray <T> {
    private Object[] element;
    private int counter;

    public SuperArray(Integer size) {
        element = new Object[size];
    }

    public void add (T something){
        if (counter>=element.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        element[counter++] = something;
    }

    public T get(int index){
        return (T) element[index];
    }

    public T remove(int index){
        //element[index] = null;
        System.arraycopy(element, index+1, element ,index, counter-index);
        counter--;
        return  (T) element;
    }



}
