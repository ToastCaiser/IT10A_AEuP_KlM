import java.util.*;
public class Aufgabe_17_sortierer {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tausch, array_size, i, j;
            System.out.print("Anzahl der Zahlen:\t");
            array_size = scanner.nextInt();
            int[] zahl = new int[array_size];

            for (i=0; i<array_size; i++)
            {
                System.out.print("Zahl " + (i+1) + ":\t");
                zahl[i] = scanner.nextInt();
            }

            for (i=array_size; i > 0 ; i--)
            {
                for (j = 0; j<i-1; j++)
                {
                    if (zahl[j]<zahl[j+1])
                    {
                        tausch = zahl[j];
                        zahl[j] = zahl[j+1];
                        zahl[j+1] = tausch;
                    }
                }
            }

            for (i=0; i < array_size; i++)
            {
                System.out.print(zahl[i] + " ");
            }
        }
    }
}
