// S� h�r skriver man f�r att importera klassen Scanner
import java.util.Scanner;

public class Calculator{
    
    public static void main(String args[])
    {
	// S� h�r skapar man en Scanner: 
	Scanner myScanner = new Scanner(System.in);
	int number0, number1;
	
	System.out.print("Skriv in ett tal: ");
	// S� h�r l�ser man in ett heltal
	number0 = myScanner.nextInt();
	
	System.out.print("Skriv in ett till tal: ");
	// S� h�r l�ser man in ett heltal
	number1 = myScanner.nextInt();

	System.out.println("Produkten av talen �r: " + (number0 * number1));
    }
}