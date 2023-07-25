import java.util.*;
public class Aufgabe_20_Dual_Dezimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dual_in, dezi = 0;
        double j=0;

        System.out.print("Dualzahl:\t");
        dual_in = scanner.nextInt();

        String temp = Integer.toString(dual_in);
        int[] dual = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++){
            dual[i] = Character.getNumericValue(temp.charAt(i));
        }

        for (int i = temp.length(); i > 0; i--){
            dezi = dezi + dual[i-1] * (int) Math.pow(2,j);
            j++;
        }

        System.out.print("\n\nDezimalzahl:\t" + dezi);

        scanner.close();
    }
}
