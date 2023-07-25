import java.util.Scanner;

public class Aufgabe_14_UnGerade {
    public static void main(String[] args) {
        try (Scanner keyb = new Scanner (System.in)) {
            int zahl;

            System.out.print("Bitte zu testende Zahl eingeben:");
            zahl = keyb.nextInt();
            if (zahl%2==0)
            {System.out.println("Die Zahl ist gerade!");}
            else
            {System.out.println("Die Zahl ist ungerade!");}
        }
    }
}
