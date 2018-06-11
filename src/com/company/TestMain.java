package com.company;

public class TestMain {
    public static void main(String[] args) {
        Player palyer = new Player.Builder()
                .atack(30)
                .hp(3000)
                .lvl(123)
                .build();

        System.out.println();
    }
}
