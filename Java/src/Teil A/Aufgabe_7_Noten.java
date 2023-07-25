import java.util.Scanner; 
class Aufgabe_7_Noten

	{
	public static void main(String[]args)
	{
	try (Scanner keyb = new Scanner (System.in)) {
		double schul1;
		System.out.print("Bitte erste Schulaufagbe eingeben: ");
		schul1 = keyb.nextDouble();
		
		double schul2;
		System.out.print("Bitte zweite Schulaufagbe eingeben: ");
		schul2 = keyb.nextDouble();
		
		double ex1;
		System.out.print("Bitte erste Ex eingeben: ");
		ex1 = keyb.nextDouble();
		
		double ex2;
		System.out.print("Bitte zweite Ex eingeben: ");
		ex2 = keyb.nextDouble();
		      
			double  anzahl = 6;
			double notenschnitt;
		        int note;   
			notenschnitt = (double)(schul1*2 + schul2*2 + ex1 + ex2)/anzahl;
		       
			notenschnitt = (double) (Math.round (notenschnitt * 100)) / 100;
		    note = (int) Math.round(notenschnitt);
			
			System.out.println("1.Schulaufgabe: " + schul1);
			System.out.println("2.Schulaufgabe: " + schul2);
			System.out.println("1.Ex:     " + ex1);
			System.out.println("2.Ex:     " + ex2);
			System.out.println("_______________________________");
			System.out.println("Notenschnitt = "+ notenschnitt);
		     
			System.out.println("Zeugnisnote = "+ note);
	}
	}
	}