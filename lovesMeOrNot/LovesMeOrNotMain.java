package main.java.lovesMeOrNot;

public class LovesMeOrNotMain {

    public static void main(String[] args) {
        LovesMe lovesMe = new LovesMe();
        LovesMeNot lovesMeNot = new LovesMeNot();

        Thread t1 = new Thread(lovesMe, "Loves Me!");
        Thread t2 = new Thread(lovesMeNot, "Loves Me Not!?");

        t1.start();
        t2.start();
    }
}
