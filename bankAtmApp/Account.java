package main.java.bankAtmApp;

public class Account {

    private int balance = 6000;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount){
        balance = balance - amount;
        //System.out.println(balance + "$ are available");
    }
}
