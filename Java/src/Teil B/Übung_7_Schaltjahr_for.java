import java.util.Scanner;
public class Übung_7_Schaltjahr_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int start_jahr, end_jahr;
        System.out.print("Start Jahr:\t");
        start_jahr = scanner.nextInt();
        System.out.print("End Jahr:\t");
        end_jahr = scanner.nextInt();

        System.out.println("Schaltjahre zwischen " + start_jahr + " und " + end_jahr + " sind:");
        for (int jahr = start_jahr; jahr <= end_jahr; jahr++)
        {
            if ((jahr%4 == 0 && jahr%100 !=0 ) || jahr%400 ==0)
            {
                System.out.println(jahr);
            }
        }


        scanner.close();
    }
}
