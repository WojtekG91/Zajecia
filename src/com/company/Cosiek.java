package com.company;

public interface Cosiek {
    int cos = 5;
    void cos1();

    default void cos2(){ //metoda defaultow
        System.out.println("Hello world"); //utworzone aby zachowac kompatybilnosc wsteczną
    }
}
