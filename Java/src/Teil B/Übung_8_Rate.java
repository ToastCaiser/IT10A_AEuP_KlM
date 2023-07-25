import java.util.*;
public class Übung_8_Rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random rng = new Random();
        int zufallszahl, ratezahl = 1200;

        zufallszahl = rng.nextInt(1000);


        for(int i = 0; i < 10 && ratezahl != zufallszahl; i++)
        {
            System.out.print("Dei Ratezahl:\t");
            ratezahl = scanner.nextInt();
            if(ratezahl == zufallszahl)
            {
                System.out.println("Congrats");
            }
            else if (ratezahl > zufallszahl)
            {
                System.out.println("Zu groß lul");
            }
            else if (ratezahl < zufallszahl)
            {
                System.out.println("Zu klein kekw");
            }
            else
            {
                System.out.println("It is Error my dudes aaaaaaaaaaaaaaaaaaa");
            }
        }

        if (ratezahl != zufallszahl)
        {
            System.out.println("Gott bist du unfähig.... Mach nnochmal");
        }


        scanner.close();
    }
}
