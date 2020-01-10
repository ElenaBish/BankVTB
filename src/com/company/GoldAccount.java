package com.company;

import java.util.Objects;

public class GoldAccount extends Account {
    private int cashBack;

    public GoldAccount(String id, int balance, User user, int cashBack) {
        super(id, balance, user);
        this.cashBack = cashBack;
    }

    public int getCashBack() {
        return cashBack;
    }

    public void setCashBack(int cashBack) {
        this.cashBack = cashBack;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GoldAccount that = (GoldAccount) o;
        return cashBack == that.cashBack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cashBack);
    }

    @Override
    public String toString() {
        return "GoldAccount{" +
                "cashBack=" + cashBack +
                '}';

    }

    @Override
    public void changeBalance(int amount) {
        boolean isBalanceAllowIncreasing=balance<0 && amount<0 && balance<=amount;
        if (isBalanceAllowIncreasing) return;

        if (amount>0)
            super.balance=1+cashBack;
    }


}
