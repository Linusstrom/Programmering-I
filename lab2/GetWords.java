public class GetWords {
    public static void main(String[] args) 
    { 
	for(int i = 0; i < args.length; i++) {
	    if(args[i].endsWith(")") && args[i].length() > 1) {
		System.out.print(" " + args[i].substring(0, args[i].length() - 1));
	    }
	}
	
    }
}