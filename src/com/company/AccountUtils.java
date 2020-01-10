package com.company;

final public class AccountUtils {
    private AccountUtils() {
    }

    public static void transferTheMoney(Account fromAccount,Account toAccount,int amount)
    {
        if (amount<0) return;

        fromAccount.balance-=amount;
        toAccount.balance+=amount;
    }

}
