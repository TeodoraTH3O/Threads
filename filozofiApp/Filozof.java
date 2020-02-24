package main.java.filozofi;

import java.awt.*;

// clasa Filozof implementează comportamentul unui concurent
class Filozof extends Thread {
    // părerea concurentului despre culoarea pălăriei sale.
    // Null dacă încă nu şi-a format o părere.
    Color parere = null;

    Filozof(String nume) {
        super(nume);
    }

    public void run() {
        // concurentii firului curent
        Filozof concurenti[] = new Filozof[2];
        // temporar
        Thread fire[] = new Thread[10];
        int numarFire = enumerate(fire);
        for (int i = 0, j = 0; i < numarFire && j < 2; i++) {
            if (fire[i] instanceof Filozof &&
                    fire[i] != this) {
                concurenti[j++] = (Filozof) fire[i];
            }
        }
        while (true) {
            Color primaCuloare = Concurs.culoare(this,concurenti[0]);
            Color adouaCuloare = Concurs.culoare(this, concurenti[1]);
            if (primaCuloare == Color.white && adouaCuloare == Color.white) {
                synchronized (this) {
                    parere = Color.black;
                }
            } else if (primaCuloare == Color.white) {
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                }
                ;
                if (Concurs.culoare(this, concurenti[1]) != concurenti[1].aGhicit()) {
                    synchronized (this) {
                        parere = Color.black;
                    }
                    ;
                }
            } else if (adouaCuloare == Color.white) {
                try {
                    sleep((int) (Math.random() * 500));
                } catch (InterruptedException e) {
                }
                ;
                if (Concurs.culoare(this, concurenti[0]) != concurenti[0].aGhicit()) {
                    synchronized (this) {
                        parere = Color.black;
                    }
                    ;
                }
            } else {
                try {
                    sleep((int) (Math.random() * 500) + 500);
                } catch (InterruptedException e) {
                }
                ;
                if (Concurs.culoare(this, concurenti[0]) != concurenti[0].aGhicit() &&
                        Concurs.culoare(this,
                                concurenti[1]) !=
                                concurenti[1].aGhicit()) {
                    synchronized (this) {
                        parere = Color.black;
                    }
                    ;
                }
            }
        }
    }

    public synchronized Color aGhicit() {
        return parere;
    }
}

