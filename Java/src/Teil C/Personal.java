//import java.util.*;

class Mitarbeiter{

    String Name, Vorname;

}

public class Personal {
    public static void main(String[] args) {
        Mitarbeiter Arbnehm_1;
        Arbnehm_1 = new Mitarbeiter();

        Arbnehm_1.Name = "Glück";
        Arbnehm_1.Vorname = "Hans";



        System.out.println("Name:\t"+Arbnehm_1.Name);
        System.out.println("Vorname:\t"+Arbnehm_1.Vorname);
    }
}
