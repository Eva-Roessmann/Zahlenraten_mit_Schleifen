/*
Titel :  Schleifen und Verzweigungen (Mathematik)
Autor : Rößmann Eva 19.05.2026
 */

import java.util.Scanner;
import java.util.Random;

public class Zahlenraten {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int zahl = r.nextInt(100) + 1;
        int tipp = 0;
        int versuche = 0;

        System.out.println("Zahlenratespiel");
        System.out.println("Rate eine Zahl zwischen 1 und 100");

        while (tipp != zahl) {

            System.out.print("Dein Tipp: ");
            tipp = sc.nextInt();

            versuche = versuche + 1;

            if (tipp < zahl) {
                System.out.println("Die Zahl ist größer");
            }

            if (tipp > zahl) {
                System.out.println("Die Zahl ist kleiner");
            }
        }

        System.out.println("Richtig!");
        System.out.println("Anzahl der Versuche: " + versuche);

        sc.close();
    }
}
