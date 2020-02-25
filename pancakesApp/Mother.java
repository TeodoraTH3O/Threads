package main.java.pancakesApp;

public class Mother extends Thread {

    private Pancake pancake;

    public Mother(Pancake p){
        pancake = p;
    }

    public void run(){
        int pancakesAvailable = 0;
        for(int i = 1; i< 10; i++){
            pancake.makePancake(i);
            System.out.println("Mother made a pancake");
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
