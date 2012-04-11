import java.io.*;

public class Splitter {
    public static void main(String[] args){
	try {	    
	    BufferedReader reader = 
		new BufferedReader(new FileReader(args[0]));
	    int counter = 0;
	    String line = reader.readLine();
	    
	    while(line != null) {
		String[] splitter = line.split(" ");
		System.out.println("Nu har raden splittrats: " + splitter);
		line = reader.readLine();
	    counter+=splitter.length;
	    }
	    System.out.println("Det finns " + counter + "ord i filen");
	    reader.close();
	}
	catch(IOException e) {
	    System.err.println("The file " + args[0] + 
			       "does not exist.");
	}      
    }
}