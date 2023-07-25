import java.util.Scanner; 
class Ausgabeformat_Scanner
	{
	public static void main(String[]args)
	    {
                try (Scanner keyb = new Scanner (System.in)) {
					boolean wert1, wert2, ausgang;
					
					System.out.print("Bitte den ersten Wert eingeben: ");
					wert1= keyb.nextBoolean();
					
					System.out.print("Bitte den zweiten Wert eingeben: ");
					wert2= keyb.nextBoolean();



					ausgang = wert1 && wert2;
					System.out.print("\n\tEingang A:\t" + wert1 + "\n\tEingang B:\t" + wert2 +"\n\n\tAusgang  :\t" + ausgang + "\n\n");
				}
		 }
		 }