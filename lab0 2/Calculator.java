// Så här skriver man för att importera klassen Scanner
import java.util.Scanner;

public class Calculator{
    
    public static void main(String args[])
    {
	// Så här skapar man en Scanner: 
	Scanner myScanner = new Scanner(System.in);
	int number0, number1;
	
	System.out.print("Skriv in ett tal: ");
	// Så här läser man in ett heltal
	number0 = myScanner.nextInt();
	
	System.out.print("Skriv in ett till tal: ");
	// Så här läser man in ett heltal
	number1 = myScanner.nextInt();

	System.out.println("Produkten av talen är: " + (number0 * number1));
    }
}