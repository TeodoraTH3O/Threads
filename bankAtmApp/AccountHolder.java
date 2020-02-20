package main.java.bankAtmApp;

public class AccountHolder implements Runnable {
    private Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }

    public void run() {
        for(int i = 0; i<=4; i++){
            if (account.getBalance() == 0){
                break;
            }
            makeWithdrawal(2000);
        }
    }

    private synchronized void makeWithdrawal(int withdrawAmount){
        if(withdrawAmount <=account.getBalance()){
            System.out.println(Thread.currentThread().getName() +
                    " is going to withdraw $"+withdrawAmount);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
            }
            account.withdraw(withdrawAmount);
            System.out.println(Thread.currentThread().getName() +
                    " completes the withdrawal of $"+withdrawAmount);
            } else {
                System.out.println("Not enought money in account for " +
                        Thread.currentThread().getName() + " to withdraw");
                System.out.println("Account is 0!");
        }
        }
}
