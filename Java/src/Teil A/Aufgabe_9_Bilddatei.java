class Aufgabe_9_Bilddatei
{
public static void main(String args[])
{
int aufl_hor,aufl_ver,farbtiefe,bitzahl;
double bytezahl,kbytezahl,mbytezahl,gbytezahl;

final double TEILER=1024.0; 

aufl_hor=1024;
aufl_ver=768;
farbtiefe=24;
bitzahl=aufl_hor*aufl_ver*farbtiefe;
bytezahl=bitzahl/8;

kbytezahl=bytezahl/TEILER;
mbytezahl=kbytezahl/TEILER;
gbytezahl=mbytezahl/TEILER;

System.out.println("Speicherbedarf in Bit = " +bitzahl);
System.out.println("Speicherbedarf in Byte = " +bytezahl);
System.out.println("Speicherbedarf in Kbyte = " +kbytezahl);
System.out.println("Speicherbedarf in MByte = " +mbytezahl);
System.out.println("Speicherbedarf in GByte  =" +gbytezahl);
}
}
