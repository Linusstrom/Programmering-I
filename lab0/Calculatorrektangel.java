// Så här skriver man för att importera klassen Scanner
import java.util.Scanner;

public class Calculatorrektangel{
	public static void main(String args[])
    {
	// Så här skapar man en Scanner: 
	Scanner myScanner = new Scanner(System.in);
	int number0, number1;
	
	System.out.print("Skriv in Rektangelns bas: ");
	// Så här läser man in ett heltal
	number0 = myScanner.nextInt();
	
	System.out.print("Skriv in Rektangelns höjd: ");
	// Så här läser man in ett heltal
	number1 = myScanner.nextInt();

	System.out.println("Rektangelns omkrets är: " + (number0 + number0 	+ number1 + number1 ));

	System.out.println("Rektangelns area är: " + (number0 * 			number1 ));
    }
}