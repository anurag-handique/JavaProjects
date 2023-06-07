package com.JavaProjects;

public class Main {
    public static void main(String[] args) {
        //customer name, customer acc no.,customer email,balance, phone no.
        //Functionality-Deposit money,Withdraw money
        Account AnuragAccount = new Account("1723010196185", 0.0, "Anurag", "anuraghandique.dev@gmail.com", "6900864982");

        AnuragAccount.DepositMoney(100);
        AnuragAccount.DepositMoney(1000);
        AnuragAccount.Withdraw(200);
    }
}
