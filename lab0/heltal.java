// Så här skriver man för att importera klassen Scanner
import java.util.Scanner;

public class heltal{
    
    public static void main(String args[])
    {
	// Så här skapar man en Scanner: 
	Scanner myScanner = new Scanner(System.in);
	short tal0;

	System.out.print("Skriv in ett tal över 60000: ");
	tal0 = myScanner.nextShort();
	System.out.println(" Du skrev: " + tal0);
    }
}