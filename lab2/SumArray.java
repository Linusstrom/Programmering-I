public class SumArray {
  public static void main(String[] args) 
  { 
      int sum = 0;
      int[] array = new int[4];

      array[0] = 5; 
      array[1] = 1;
      array[2] = 3; 
      array[3] = 2;
    
      for(int i = 0; i < array.length; i++){
        sum = sum + array[i]; //sum += array[i];
      }
	
	System.out.println("Summan är: " + sum);
  }
}