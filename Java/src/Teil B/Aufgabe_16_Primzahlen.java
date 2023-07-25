import java.util.Scanner;
public class Aufgabe_16_Primzahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = 0;
        boolean ist_prim;
        System.out.print("Zu testende Zahl eingeben:\t");
        zahl = scanner.nextInt();

        for(int i=2; i <= zahl; i++)
        {
            ist_prim = true;

            for ( int j = 2; j<i && ist_prim==true; j++)
            {
                if( i%j == 0)
                {
                    ist_prim=false;
                }
            }
            if (ist_prim)
            {
                System.out.println(i + " ist eine Primzahl");
            }
        }


        scanner.close();
    }
}
