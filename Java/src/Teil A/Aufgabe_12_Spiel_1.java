public class Aufgabe_12_Spiel_1 {
    
    public static void main(String[] args) {
        

        String spiel[][] = new String[3][3];

        spiel[0][0]="Stadt";
        spiel[0][1]="Land ";
        spiel[0][2]="Fluss";
        spiel[1][0]="Aachen";
        spiel[1][1]="Armenien";
        spiel[1][2]="Ammer";
        spiel[2][0]="Berling";
        spiel[2][1]="Bulgarien";
        spiel[2][2]="Bodensee";

        System.out.println(spiel[0][0] + "\t" + spiel[0][1] + "\t\t"  + spiel[0][2]);
        System.out.println(spiel[1][0] + "\t" + spiel[1][1] + "\t"  + spiel[1][2]);
        System.out.println(spiel[2][0] + "\t" + spiel[2][1] + "\t"  + spiel[2][2]);

    }
}
