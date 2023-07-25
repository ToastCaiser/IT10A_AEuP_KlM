class Aufgabe_5_Division
	{
	public static void main(String[]args)
	{
	//Deklaration
	float wert1, wert2, div, wert11,wert21,div1;
    double mod, mod1;
	//Initialisierung
	wert1 = 5.0f;
	wert2 = 2.0f;
	wert11 = 6.0f;
	wert21 = 3.0f;
	//Berechnung
	div = wert1 / wert2;
	div1 = wert11/wert21;
	mod = wert1 % wert2;
	mod1 = wert11 % wert21;
	//Ausgabe
	System.out.println(div);
	System.out.println(mod);
	System.out.println(div1);
	System.out.println(mod1);
	}
}