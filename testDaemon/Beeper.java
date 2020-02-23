package main.java.exemplul4;

class Beeper implements Runnable {
    public void run() {
        while (true) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
