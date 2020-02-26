package main.java.exemplul9;

import java.awt.*;
import java.util.TimerTask;

class Atentie extends TimerTask {

    public void run() {
        Toolkit.getDefaultToolkit().beep();
        System.out.print(".");
    }
}


