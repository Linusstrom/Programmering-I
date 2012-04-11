public class Recursion {
    /**
     * Calculates n!
     * @param n
     * @return n!
     */
    public static int fractal(int n)  {
	if(n == 0) {
	    return 1;
	} else {
	    return n * fractal(n-1); 
	}
    }
    
    /**
     * Returns the n'th fibonacci number
     * @param n
     * @return the n'th fibonacci number
     */
    public static int tribonacci(int n) {
	if(n == 3) {
	    return 1;
	} else if  (n<=2) {
		return 0;
	} else {
	    return tribonacci(n-3) + tribonacci(n-2) + tribonacci(n-1); 
	}
    }
    
    public static void main(String[] args) {
	System.out.println("fractal:");

	for(int i = 0; i < 10; i++) {
	    System.out.println(tribonacci(i));
	}

	System.out.println("\ntribonacci:");
	for(int i = 0; i < 10; i++) {
	    System.out.println(tribonacci(i));
	}
	
	
    }
}
