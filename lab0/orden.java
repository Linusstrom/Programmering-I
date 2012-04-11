// Så här skriver man för att importera klassen Scanner
import java.util.Scanner;

public class orden{
    
    public static void main(String args[])
    {
	// Så här skapar man en Scanner: 
	Scanner myScanner = new Scanner(System.in);
	String string0, string1;

	System.out.print("Skriv in ett ord: ");
	// Så här läser man in en string
	
	string0 = myScanner.next();
	
	System.out.print("Skriv in ett till ord: ");
	// Så här läser man in en string
	
	string1 = myScanner.next();
	System.out.println("Längden på 1a ordet är: " + string0.length() + " Längden på 2a ordet är: " + string1.length() + " Sammanlagda längden på orden är: " +((string0.length()) + string1.length()));
	//System.out.println("Längden på 1a ordet är: " + string0.length());
	//System.out.println("Längden på 2a ordet är: " + string1.length());
	//System.out.println("Sammanlagda längden på orden är: " +((string0.length()) + string1.length()));
    }
}