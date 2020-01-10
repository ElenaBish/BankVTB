package com.company;

public class RegularAccount extends Account {
    public RegularAccount(String id, int balance, User user) {
        super(id, balance, user);
    }

    @Override
    public void changeBalance(int amount) {
        boolean isBalanceAllowIncreasing=balance>0 && amount<0 && balance<=amount;
        if (isBalanceAllowIncreasing) return;

        super.balance+=amount;

    }
}
