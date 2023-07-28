/**
*.........+.........+.........+.........+.........+.........+....;
* Datei: TastEin.java
*
  Funktion: Hilfsklasse
  Klasse mit Methoden zum Einlesen der elementaren Datentypen
  Integer, Float, String, Char, Boolean.

  Jeder Methode kann ein String übergeben werden, der die Frage
  enthällt. Beispiel:
    TastEin.liesInt("Bitte geben Sie das Alter ein: ");

  Alle 5 Methoden sind
  - public, d.h. in anderen Klassen (Programmen) aufrufbar;
  - static, d.h. von der Klasse TastEin wird keine Instanz
    abgeleitet.
*/


import java.io.*;

class TastEin
{
// 1. --------------------------------------------------------

 public static int liesInt(String frageNachInt)
 {
  int i = 0;
  try
  {
   BufferedReader Ein = new BufferedReader(
                       new InputStreamReader(System.in));
   boolean eingabe_OK;
   do
   {
    eingabe_OK = true;
    try
    {
     System.out.print(frageNachInt);
     i = Integer.parseInt(Ein.readLine());
    }
     catch(NumberFormatException e)
    {
     System.out.println("Eingabefehler! Nochmal: ");
     eingabe_OK = false;
    }
   }
   while(eingabe_OK == false);
  }
  catch (IOException e) {System.err.println(e);}
  return i;
 }

// 2. -------------------------------------------------------

 public static float liesFloat(String frageNachFloat)
 {
  float f = 0.0f;
  try
  {
   BufferedReader Ein = new BufferedReader(
                        new InputStreamReader(System.in));

   boolean eingabe_OK;
   do
   {
    eingabe_OK = true;
    try
    {
     System.out.print(frageNachFloat);
     //Float Fl = new Float(Ein.readLine());
     Float Fl = Float.parseFloat(Ein.readLine());
     f = Fl.floatValue();
    }
    catch(NumberFormatException e)
    {
     System.out.println("Eingabefehler! Nochmal: ");
     eingabe_OK = false;
    }
   }
   while(eingabe_OK == false);
  }
  catch (IOException e) {System.err.println(e);}
  return f;
 }

// 3. --------------------------------------------------------

 public static String liesString(String frageNachString)                                               {
  String s ="";
  try
  {
   BufferedReader Ein = new BufferedReader(
                        new InputStreamReader(System.in));

   System.out.print(frageNachString);
   s = Ein.readLine();
  }
  catch (IOException e) {System.err.println(e);}
  return s;
 }

// 4. --------------------------------------------------------

 public static char liesChar(String frageNachChar)
 {
  char c = '0';
  try
  {
   BufferedReader Ein = new BufferedReader(
                        new InputStreamReader(System.in));

   System.out.print(frageNachChar);
   c = Ein.readLine().charAt(0);
  }
  catch (IOException e) {System.err.println(e);}
  return c;
 }

// 5. -------------------------------------------------------

 public static boolean liesBoolean(String frageNach_j_n)
 {
  boolean b = false;
  char c = '0';
  try
  {
   BufferedReader Ein = new BufferedReader(
                        new InputStreamReader(System.in));
   do
   {
    System.out.print(frageNach_j_n);
    c = Ein.readLine().charAt(0);
   }
   while(!((c=='j')||(c=='n')));
   if (c =='j')
   {
    b = true;
   }
  }
  catch (IOException e) {System.err.println(e);}
  return b;
 }

// ----------------------------------------------------

}
