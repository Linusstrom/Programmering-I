import java.io.*;

public class ReadFromFile {
    public static void main(String[] args){
	try {	    
	    BufferedReader reader = 
		new BufferedReader(new FileReader(args[0]));
	    
	    String line = reader.readLine();
	    int counter = 0;
	    while(line != null) {
		System.out.println(line);
		counter++;
		line = reader.readLine();
		    
	}
	 	System.out.println("det finns " +counter+ " rader i denna filen.");   
	    reader.close();
	}
	catch(IOException e) {
	    System.err.println("The file " + args[0] + 
			       "does not exist.");
	}      
    }
}