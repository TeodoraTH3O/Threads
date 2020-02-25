package main.java.pancakesApp;

public class Pancake {

    private int numberOfPancakes = 0;
    private boolean available = false;

    public synchronized int getPancakeFromMom() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return numberOfPancakes;
    }

    public synchronized void makePancake(int numberOfPancakesMade) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.numberOfPancakes = numberOfPancakesMade;
        available = true;
        notifyAll();
    }
}
