package main.java.pancakesApp;

public class Child extends Thread {

    private Pancake pancake;

    public Child(Pancake p){
        pancake = p;
    }

    public void run(){
        int value = 0;
        for (int i = 1; i < 10; i++) {
            value = pancake.getPancakeFromMom();
            System.out.println(Thread.currentThread().getName() +
                    " ate a pancake");
        }
    }
}
