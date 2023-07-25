import java.util.*;
public class Übung_4_Endpreis {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            float ep, ww;
            System.out.print("Warenwert:\t");
            ww = scanner.nextFloat();
            System.out.print("\n\n");

            if (ww < 100f)
            {
                ep = ww + 20.0f;
            }

            else if (ww < 200f)
            {
                ep = ww + 10.0f;
            }

            else if (ww < 500f)
            {
                ep = ww + 5.0f;
            }

            else if (ww < 1000f)
            {
                ep = ww;
            }

            else
            {
                ep = ww * 0.95f;
            }

            System.out.println("Bei Wahrenwert von " + ww + " Euro ist der Endpreis " + ep + " Euro");
            System.out.print("\n\n");
        }
    }
}
