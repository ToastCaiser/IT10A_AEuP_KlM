import java.util.Scanner;
public class Aufgabe_15_Noten_3 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner (System.in);
        int noten_in, sa_noten, ex_noten;
        sa_noten = 0;
        ex_noten = 0;
        float schnitt = 0.00f;


        for (int i = 1; i<= 8; i++)
        {
            if (i <= 4){
                System.out.print(i + " SA Note eingeben:\t");
                noten_in = keyb.nextInt();
                sa_noten = sa_noten + noten_in;
            }
            else{
                System.out.print(i-4 + " EX Note eingeben:\t");
                noten_in = keyb.nextInt();
                ex_noten = ex_noten + noten_in;
            }

        }

        schnitt = (((sa_noten*2)+ex_noten)/12);
        System.out.println("\n\n______________________");

        System.out.println("Durchschnittnote: " + schnitt);




        keyb.close();
    }
}
