package main.java.lovesMeOrNot;

public class LovesMeNot extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(currentThread().getName());
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
