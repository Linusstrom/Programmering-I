import java.io.*;

public class WriteToFile {
    public static void main(String[] args){
	try {	    
	    BufferedWriter writer = 
		new BufferedWriter(new FileWriter(args[0]));
	    
	    String[] data = {"Hello", "world", "!"};
	    
	    for(int i = 0; i < data.length; i++) {
		writer.write(data[i] + "\n");
	    } 
	    
	    writer.close();
	}
	catch(IOException e) {
	    System.err.println("Error!");
	}      
    }
}
