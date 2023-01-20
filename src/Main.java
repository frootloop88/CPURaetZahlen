import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner myscan = new Scanner(System.in);

        int eingabe, max = 100, min = 1, rngcpu;

        Random rng = new Random();
        boolean schleife = true;

        System.out.println(" Der Computer errät deine Zahl");
        System.out.println(" ...bitte Zahl eingeben");
        eingabe = myscan.nextInt();




        while (true) {
            rngcpu = rng.nextInt(min, max);
            schleife = true;
            String gok = null;


            System.out.println("Zahl vom Computer: " + rngcpu);
            System.out.println("Die gesuchte Zahl lautet: " + eingabe);
            System.out.println("____________________________________");
            System.out.println("(k)leiner (g)rößer (o) Treffer");


            while (schleife) {
                gok = myscan.next();
                if (gok.equals("o")) {
                    schleife = false;
                } else if (gok.equals("k") && rngcpu > eingabe) {
                    schleife = false;
                } else if (gok.equals("g") && rngcpu < eingabe) {
                    schleife = false;
                } else {
                    System.out.println("Nicht lügen!");
                }
            }


            if (gok.equals("o") && rngcpu == eingabe) {
                System.out.println("Der Computer hat die Zahl erraten");
                break;
            } else if (gok.equals("k")) {
                max = rngcpu;
            } else if (gok.equals("g"))
                min = rngcpu;

        }
    }
}