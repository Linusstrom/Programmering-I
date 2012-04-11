public class PrintArray {
    public static void main(String[] args) 
    { 
	int[] array = new int[4];
	
	array[0] = 0; 
	array[1] = 1;
	array[2] = 2; 
	array[3] = 3;
	
	for(int i = 0; i < array.length; i++) {
	    System.out.println(array[i]);
	}
    }
}