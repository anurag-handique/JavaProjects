package com.JavaProjects;

public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber) {//this is constructor.
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public void DepositMoney(double DepositMoney) {
        this.Balance += DepositMoney;
        System.out.println("Deposit is successful , new balance is Rs- " + this.Balance);
    }

    public void Withdraw(double WithdrawlMoney) {
        if (this.Balance - WithdrawlMoney < 0) {
            System.out.println("Withdraw Unsuccessful..only Rs- " + this.Balance + " is left");
        } else {
            this.Balance -= WithdrawlMoney;
            System.out.println("Withdraw Successful , Current Balance is Rs- " + this.Balance);
            System.out.println("Thanks for using Banking Application....Have a good Day!!");
        }
    }

    public String getNumber() {//Getters and Setters
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


}
