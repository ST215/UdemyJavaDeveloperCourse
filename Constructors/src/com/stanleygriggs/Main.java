package com.stanleygriggs;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account(); //("12345", 0.00, "Bob Brown", "bob@bob.com", "555-555-5555");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}
