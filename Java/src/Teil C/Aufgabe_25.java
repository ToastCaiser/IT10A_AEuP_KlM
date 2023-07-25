import java.util.*;

class Bank_Verwaltung {
    String NameKunde;
    float KontoAlt = 0.0f, Einzahlung = 0.0f, Zwischenbetrag = 0.0f, Zinsbetrag = 0.0f, KontoNeu = 0.0f;
    float Zinssatz = 5.0f;

    float Summe(){
        Zwischenbetrag = KontoAlt + Einzahlung;
        return Zwischenbetrag;
    }
    float Zinsen(){
        Zinsbetrag = Zwischenbetrag*Zinssatz/100;
        return Zinsbetrag;
    }
    float Kapital(){
        KontoNeu=Zwischenbetrag+Zinsbetrag;
        return KontoNeu;
    }
    void Ausgabe(){
        System.out.println("Kunde: " + NameKunde);
        System.out.println("Kontostand alt\t\t="+KontoAlt+" Euro");
        System.out.println("Einzahlung\t\t="+Einzahlung+" Euro");
        System.out.println("Zwischenbetrag\t\t="+Summe()+" Euro");
        System.out.println("Zinsbetrag\t\t="+Zinsen()+" Euro");
        System.out.println("Kontostand neu\t\t="+Kapital()+" Euro");
    }
}

public class Aufgabe_25 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        Bank_Verwaltung Kunde = new Bank_Verwaltung();

        System.out.print("Name des Kunden: \t");
        Kunde.NameKunde = keyb.nextLine();
        System.out.print("Alter Kontostand:\t");
        Kunde.KontoAlt = keyb.nextFloat();
        System.out.print("Einzahlung:\t\t");
        Kunde.Einzahlung = keyb.nextFloat();
        keyb.close();

        Kunde.Ausgabe();

    }
}