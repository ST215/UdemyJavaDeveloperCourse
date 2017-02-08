package com.stanleygriggs;

public class Main {

    public static void main(String[] args) {
        int mybyte = 10;
        short myShort = 20;
        int myInt = 50;

        long longTotal = 50000L + 10L * ( mybyte + myInt + myShort);

        System.out.println("longTotal = " + longTotal);
    }
}
