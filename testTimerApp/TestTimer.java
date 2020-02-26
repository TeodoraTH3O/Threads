package main.java.exemplul9;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {

    public static void main(String args[]) {
        // Setam o actiune repetitiva, cu rata fixa
        final Timer t1 = new Timer();
        t1.scheduleAtFixedRate(new Atentie(), 0, 1 * 1000);

        // Folosim o clasa anonima pentru o alta actiune
        Timer t2 = new Timer();
        t2.schedule(new TimerTask() {
            public void run() {
                System.out.println("S-au scurs 10 secunde.");
                // Oprim primul timer
                t1.cancel();
            }
        }, 10 * 1000);

        // Setam o actiune pentru ora 14:44
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        calendar.set(Calendar.MINUTE, 44);
        calendar.set(Calendar.SECOND, 0);
        Date ora = calendar.getTime();

        Timer t3 = new Timer();
        t3.schedule(new Alarma(" Toti copiii la culcare!"), ora);
    }
}
