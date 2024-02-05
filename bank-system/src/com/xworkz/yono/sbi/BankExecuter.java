package com.xworkz.yono.sbi;

import com.xworkz.yono.sbi.bankAccount.BankAccount;
import com.xworkz.yono.sbi.savings.Savingsaccount;

public class BankExecuter {

    public static void main(String[] args) {
        BankAccount myAccount=new Savingsaccount();
        myAccount.setBalance(200000);
        myAccount.credit(1200);
        myAccount.credit(5000);
        myAccount.debit(2000);
        System.out.println("avaliable balance"+myAccount.getBalance());

        Savingsaccount friendAccount =new Savingsaccount();
        myAccount.transfer(2000,friendAccount);
        System.out.println("my amount after transfer"+myAccount.getBalance());
        System.out.println("amount after transfer in friends account"+friendAccount.getBalance());

        Savingsaccount brothersAccount =new Savingsaccount();
        brothersAccount.transfer(500,myAccount);
        System.out.println("my amount after transfer"+brothersAccount.getBalance());
        System.out.println("amount after transfer in  myaccont account"+myAccount.getBalance());
        System.out.println("------------------------------------------------------------------------");

      Savingsaccount momsaccount =new Savingsaccount();
      myAccount.transfer(20000,momsaccount);
        System.out.println("my amount after transfer"+myAccount.getBalance());
        System.out.println("amount after transfer in momsaccount"+momsaccount.getBalance());
        System.out.println("------------------------------------------------------------------------");

        Savingsaccount omkarsAccount =new Savingsaccount();
        myAccount.transfer(10000,omkarsAccount);
        System.out.println("my amount after transfer"+myAccount.getBalance());
        System.out.println("amount after transfer in omkarssaccount"+omkarsAccount.getBalance());
        System.out.println("------------------------------------------------------------------------");


        Savingsaccount xworksAccount= new Savingsaccount();
        myAccount.transfer(30000,xworksAccount);
        System.out.println("my amount after transfer"+myAccount.getBalance());
        System.out.println("amount after transfer in xworks"+xworksAccount.getBalance());
        System.out.println("------------------------------------------------------------------------");

        Savingsaccount akashAccount =new Savingsaccount();
        myAccount.transfer(2000,akashAccount);
        System.out.println("my amount after transfer"+myAccount.getBalance());
        System.out.println("amount after transfer in akashsaccount"+akashAccount.getBalance());
        System.out.println("------------------------------------------------------------------------");



    }
    }

