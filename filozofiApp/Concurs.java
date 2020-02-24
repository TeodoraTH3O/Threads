package main.java.filozofi;

import java.awt.*;

public class Concurs {
    private static Color palarii[] = {Color.black, Color.black, Color.black};
    private static Filozof filozofi[] = new Filozof[3];

    public static void main(String args[]) {
        for (int i = 0; i < args.length && i < 3; i++) {
            if (args[i].equalsIgnoreCase("alb")) {
                palarii[i] = Color.white;
            } else if (args[i].equalsIgnoreCase("negru")) {
                palarii[i] = Color.black;
            }
        }
        for (int i = 0; i < 3; i++) {
            filozofi[i] = new Filozof("Filozoful " + (i + 1));
        }
        for (int i = 0; i < 3; i++) {
            filozofi[i].start();
        }
        System.out.println("Concurenti:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\t" +
                    filozofi[i].getName() + " "
                    + ((palarii[i] == Color.white) ?
                    "alb" : "negru"));
        }
        gata:
        while (true) {
            for (int i = 0; i < 3; i++) {
                if (filozofi[i].aGhicit() == palarii[i]) {
                    System.out.println(
                            filozofi[i].getName() +
                                    " a ghicit.");
                    break gata;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            filozofi[i].stop();
            try {
                filozofi[i].join();
            } catch (InterruptedException e) {
            }
            ;
        }
    }

    public static Color culoare(Filozof filozof, Filozof concurent) {
        if (filozof != concurent) {
            for (int i = 0; i < 3; i++) {
                if (filozofi[i] == concurent) {
                    return palarii[i];
                }
            }
        }
        return null;
    }
}
