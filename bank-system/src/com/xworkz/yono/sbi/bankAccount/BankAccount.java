package com.xworkz.yono.sbi.bankAccount;

public class BankAccount {

    private double balance;
    public void debit(int amount){
        System.out.println("debit is invoked");
        if(amount<=balance){
           this. balance=balance-amount;
            System.out.println("remaining balance is "+balance);
        }
    }

    public void credit(int amount){
        System.out.println("credit is invoked");
        System.out.println("creaditing the amount"+balance);
        this.balance=balance+amount;
    }
    public void transfer(int amount,BankAccount beneficiaryAccount){
        System.out.println("transfer is invoked");
        this.debit(amount);
        beneficiaryAccount.credit(amount);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void BankAccount () {
        return ;
    }
}
