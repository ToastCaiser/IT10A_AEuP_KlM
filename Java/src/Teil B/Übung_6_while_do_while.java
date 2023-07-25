public class Übung_6_while_do_while {
    public static void main(String[] args) {
        int i = 1;
        while (i<11)
        {
            System.out.print(i+" ");
            i++;
        }
        System.out.println("\n");
        i = 0;
        do
        {
            i++;
            System.out.print(i + " ");
        }
        while (i<10);
    }
}
