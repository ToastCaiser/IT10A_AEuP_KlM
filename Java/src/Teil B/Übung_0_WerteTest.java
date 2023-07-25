import java.util.Scanner;

public class Übung_0_WerteTest {
    public static void main(String[] args) {
        try (Scanner keyb = new Scanner (System.in)) {
            int wert;
            System.out.print("Bitte den zu Untersuchenden Wert eingeben:");
            wert = keyb.nextInt();

            if (wert<10)
            {
                System.out.println("Wert ist kleiner als 10!");
            }
            else if((wert>=10) && (wert<20))
            {
                System.out.println("Wert ist groesser oder gleich 10 und kleiner 20!");
            }
            else if((wert>=20) && (wert<30))
            {
                System.out.println("Wert ist groesser oder gleich 20 und kleienr 30!");
            }
            else
            {
                System.out.println("Wert ist groesser/gleich 30!");
            }
        }
    }
}
