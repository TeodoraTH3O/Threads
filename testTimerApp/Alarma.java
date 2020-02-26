package main.java.exemplul9;

import java.util.TimerTask;

class Alarma extends TimerTask {
    public String mesaj;

    public Alarma(String mesaj) {
        this.mesaj = mesaj;
    }

    public void run() {
        System.out.println(mesaj);
    }
}