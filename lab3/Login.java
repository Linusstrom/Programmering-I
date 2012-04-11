import java.util.Scanner;

public class Login{
    public static void main(String[] args) { 
	String username = "", password = "";
	Scanner myScanner = new Scanner(System.in);
	while(!((username.equals("Lotta85") &&
		password.equals("123456")) ||
	    (username.equals("kalle82") &&
		password.equals("1234AB"))))
 
{
	    System.out.print("username: ");
	    username = myScanner.next(); 
	    System.out.print("password: ");
	    password = myScanner.next();
		
	} 
	
	System.out.println("Welcome!");
    }
}    