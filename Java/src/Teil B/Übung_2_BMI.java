import java.util.*;
public class Übung_2_BMI {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            char sex;
            String sexin;
            int bmi;
            float weight, height;

            System.out.println("Zum BMi berechnen geben sie bitte folgende Informationen ein:");
            System.out.print("Gschlecht (kleingeschrieben):\t");
            sexin = scanner.nextLine();
            sex = sexin.charAt(0);
            System.out.print("Gewicht:\t");
            weight = scanner.nextInt();
            System.out.print("Groesse:\t");
            height = scanner.nextFloat();

            bmi= (int) (weight/(height*height));

            System.out.println(bmi);

            if (sex == 'm')
            {
                System.out.println("Als ein Mann mit einem Gewicht von " + weight + " kg und einer Größe von " + height + " Meter haben sie einen BMI von " + bmi + ".");

                if (bmi < 20)
                {
                    System.out.println("Ihr BMI zeigt ein Untergewicht an.");
                }
                else if (bmi < 25)
                {
                    System.out.println("Ihr BMI zeigt ein Normalgewicht an.");
                }
                else
                {
                    System.out.println("Ihr BMI zeigt ein Übergewicht an.");
                }
            }



            else
            {
                System.out.println("Als eine Frau mit einem Gewicht von " + weight + " kg und einer Größe von " + height + " Meter haben sie einen BMI von " + bmi + ".");

                if (bmi < 19)
                {
                    System.out.println("Ihr BMI zeigt ein Untergewicht an.");
                }
                else if (bmi < 24)
                {
                    System.out.println("Ihr BMI zeigt ein Normalgewicht an.");
                }
                else
                {
                    System.out.println("Ihr BMI zeigt ein Übergewicht an.");
                }

            }
        }


    }
}
