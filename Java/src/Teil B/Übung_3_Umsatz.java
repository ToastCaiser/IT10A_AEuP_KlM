import java.util.*;


public class Übung_3_Umsatz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            int ist_umsatz, plan_umsatz, a_umsatz;
            String produkt_name;
            a_umsatz = 500000;

            System.out.println("Bitte folgende Daten eingeben:");
            System.out.print("Produktname:\t");
            produkt_name = scanner.nextLine();
            System.out.print("Plan-Umsatz:\t");
            plan_umsatz = scanner.nextInt();
            System.out.print("Ist-Umsatz:\t");
            ist_umsatz = scanner.nextInt();
            System.out.println("\n\n");

            if (ist_umsatz > a_umsatz)
            {
                System.out.println(produkt_name + " ist ein A-Produkt!");
            }
            else if (ist_umsatz > plan_umsatz)
            {
                System.out.println(produkt_name + " ist ein B-Produkt!");
            }
            else
            {
                System.out.println(produkt_name + " ist ein C-Produkt");
            }
        }

    }
}
