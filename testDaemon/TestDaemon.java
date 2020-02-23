package main.java.exemplul4;

public class TestDaemon {
    public static void main(String args[]) throws java.io.IOException {
        Thread t = new Thread(new Beeper());
        t.setDaemon(true);
        t.start();
        System.out.println(" Apasati Enter ... ");
        System.in.read();
    }
}

