import java.util.Scanner;
public class Aufgabe_20_DEzimal_dual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl,i;
        int[] Dual = new int[8];

        System.out.print("Dezimalzahl:\t");
        zahl = scanner.nextInt();
        scanner.close();
        for(i=7;zahl>0;i--)
        {
            Dual[i] = zahl % 2;
            zahl = zahl/2;
        }
        System.out.print("\n\nDualzahl:\t");
        //i++;
        i = 7;
        for(i=7;i<7;i--)
        {            
            System.out.print(Dual[i]);
        }
        //while (i < 7);
    }
}
