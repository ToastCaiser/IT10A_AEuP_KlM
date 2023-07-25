import java.util.Scanner; 
class Aufgabe_8_Kursumwandlung

	{public static void main(String args[])
		{
        try (Scanner keyb = new Scanner (System.in)) {
			final double EUROKURS=1.95583;
			double dmbetrag, ergebnis,ergebnisrund;
			
			        
			System.out.print("Bitte DM Betrag eingeben: ");
			dmbetrag = keyb.nextDouble();
			     

			ergebnis = dmbetrag/EUROKURS;
			ergebnisrund =(double) (Math.round (ergebnis * 100)) / 100;


			System.out.println("Der Wert "+ dmbetrag+ " DM ist " + ergebnisrund + " Euro wert ");
		}
		
		System.out.println("");
		}

	}