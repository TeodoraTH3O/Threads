package main.java.lovesMeOrNot;

public class LovesMe implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
