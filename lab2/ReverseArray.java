public class ReverseArray {
  public static void main(String[] args) 
  { 
      double[] array = new double[4];

      array[0] = 5.0; 
      array[1] = 1.1;
      array[2] = 3.2; 
      array[3] = 2.3;
    
      for(int i = 0; i < array.length/2; i++){
         double swap = array[array.length - 1 - i];
         array[array.length - 1 - i] = array[i];
         array[i] = swap;  
      }
  }
}