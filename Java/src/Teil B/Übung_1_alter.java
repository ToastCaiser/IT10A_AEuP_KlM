import java.util.Scanner;
public class Übung_1_alter {
    public static void main(String[] args) {
        try (Scanner deimum = new Scanner (System.in)) {
            int alter;

            System.out.print("Bitte Alter eingeben:");
            alter = deimum.nextInt();

            if (alter < 6)
            {System.out.println("Sie sind ein Kleinkind");}
            else if (alter < 12)
            {System.out.println("Sie sind ein Kind");}
            else if (alter < 18)
            {System.out.println("Sie sind ein Teenager");}
            else if (alter <  60)
            {System.out.println("Sie sind ein Erwachsener");}
            else if (alter < 130)
            {System.out.println("Sie sind ein Rentner");}
            else
            {System.out.println("Sie sind tot!");}
        }
    }
}
