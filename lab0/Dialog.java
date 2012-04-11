// Så här skriver man för att importera klassen Scanner
import java.util.Scanner;

public class Dialog{
    public static void main(String args[])
    {
	// Så här skapar man en Scanner: 
	Scanner myScanner = new Scanner(System.in);
	// Så här skapar man en variabel som innehåller en tom sträng
	String input = "";
	int numb;
	System.out.println("Hej!");
	System.out.print("Vad heter du? ");
	
	input = myScanner.next();
	
	System.out.print("Hur gammal är du? ");
	numb = myScanner.nextInt();
	System.out.println("Du heter " + input +  " och är " + numb + " år.");
    }
}