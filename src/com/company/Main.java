package com.company;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        User.Builder Petrov=new User.Builder("1","Sasha").lastname("Petrovich").surname("Petrov").genus("F").age(25);
        RegularAccount account = new RegularAccount(UUID.randomUUID().toString(), 100, BlackJack);

    }
}
