package com.company;

 public class User {
    private final String id;
    private final String name;
    private final String surname;
    private final String lastname;
    private final String genus;
    private final int age;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }



     public User() {

     }

     public static class Builder {
        private final String id;
        private final String name;

        private String surname = "";
        private String lastname = "";
        private String genus = "F";
        private int age = 0;

        public Builder(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder surname(String str) {
            surname = str;
            return this;
        }

        public Builder lastname(String str) {
            lastname = str;
            return this;
        }

        public Builder genus(String str) {
            genus = str;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public User build() {
            return new User();
        }
    }
    private User(Builder createUser) {
        surname=createUser.surname;
        lastname=createUser.lastname;
        genus=createUser.genus;
        age=createUser.age;
    }



}
