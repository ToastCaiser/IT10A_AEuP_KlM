import java.util.Scanner;

public class Übung_5_Bußgeld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        boolean inOrt;
        int gesch, geschUeb, bussgeld;

        System.out.print("Sind Sie Innerorts gefahren?\t\t");
        inOrt = scanner.nextBoolean();
        System.out.print("Wie schnell sind sie gefahren:\t\t");
        gesch = scanner.nextInt();


        
        if (inOrt == true){

            geschUeb = gesch - 50;

            if (geschUeb <= 20)
            {
                bussgeld = 0;
            }

            else if (geschUeb <= 25)
            {
                bussgeld = 80;
            }

            else if (geschUeb <= 30)
            {
                bussgeld = 100;
            }

            else if (geschUeb <= 40)
            {
                bussgeld = 160;
            }

            else if (geschUeb <= 50)
            {
                bussgeld = 200;
            }
            
            else if (geschUeb <= 60)
            {
                bussgeld = 280;
            }

            else if (geschUeb <= 70)
            {
                bussgeld = 480;
            }

            else 
            {
                bussgeld = 680;
            }


        }



        else{
            
            geschUeb = gesch - 100;

            if (geschUeb <= 20)
            {
                bussgeld = 0;
            }

            else if (geschUeb <= 25)
            {
                bussgeld = 70;
            }

            else if (geschUeb <= 30)
            {
                bussgeld = 80;
            }

            else if (geschUeb <= 40)
            {
                bussgeld = 120;
            }

            else if (geschUeb <= 50)
            {
                bussgeld = 160;
            }
            
            else if (geschUeb <= 60)
            {
                bussgeld = 240;
            }

            else if (geschUeb <= 70)
            {
                bussgeld = 440;
            }

            else 
            {
                bussgeld = 600;
            }


        }


        System.out.print("________________________________________\n\n");
        System.out.println("Ihr Bußgeld beträgt:\t" + bussgeld + " Euro");
        scanner.close();
    }
}
