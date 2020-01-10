package com.company;

import java.util.Objects;

abstract public class Account {
    private String id;
    protected int balance;
    private User user;

    public Account(String id, int balance, User user) {
        this.id = id;
        this.balance = balance;
        this.user = user;
    }

    final public String getId() {
        return id;
    }

    final public void setId(String id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

   abstract   public void changeBalance(int amount);

    final public User getUser() {
        return user;
    }

    final public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
