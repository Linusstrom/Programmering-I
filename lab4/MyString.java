import java.util.Scanner;

public class MyString{

    // Uppgift 5
    /**
     * uppgift 5: examines if two strings are equal
     * @param s0 the first string
     * @param s1 the second string
     * @return returns true if s0 and s1 are equal
     */
      public static boolean equals(String s0, String s1) {
        int ls0 = s0.length();
        int ls1 = s1.length();
        if(ls1 != ls0) {
          return false;
        }

        char[] ss0 = s0.toCharArray();
        char[] ss1 = s1.toCharArray();

        for (int n = 0; n < ss1.length; n++) {
          if(ss0[n] != ss1[n]){
            return false;
          }
        }

        return true;
  }
      
    

    // uppgift 6
    /**
     * uppgift 6: examines if the string s exists in the array
     * @param array an array with strings
     * @param s one string
     * @return returns true if s exists in the array
     */
    public static boolean exists(String[] array, String s) {
        for(int i=0; i<array.length; i++){
if(array[i].equals(s))
return true;
}
return false;
    }

    // uppgift 7
    /**
     * uppgift 7: reverses the given string
     * @param s the string to be reversed
     */
    public static String backwards(String s) {
        char[] array = s.toCharArray();

        for(int i=0; i<array.length / 2; i++){
char swap = array[array.length -1 - i];
array[array.length -1 - i] = array[i];
array[i] = swap;
}
        return s;
    }

    public static void main(String[] args) {
        String[] words = {"bil", "dator", "stol", "bord", "boll"};
Scanner myScanner = new Scanner(System.in);
        String string0 = "", string1 = "";

        System.out.print("Skriv in ett ord: ");
        string0 = myScanner.next();
        System.out.print("Skriv in ett till ord: ");
        string1 = myScanner.next();
    
       
        // Är strängarna string0 och string1 lika?
        if(equals(string0, string1)) {
            System.out.println("Orden " + string0 + " och " + string1 + " är lika");
        }
        else {
           System.out.println("Orden " + string0 + " och " + string1 + " är olika");
        }

        // finns string0 i arrayen words?
        if(exists(words, string0)) {
          System.out.println("Ordet " + string0 + " finns i arrayen");
        }
        else {
            System.out.println("Ordet " + string0 + " finns inte i arrayen");
        }


        // finns string1 i arrayen words?
        if(exists(words, string1)) {
          System.out.println("Ordet " + string1 + " finns i arrayen");
        }
        else {
            System.out.println("Ordet " + string1 + " finns inte i arrayen");
        }


// Skriv ut string0 och string1 baklänges
System.out.println("Ordet " + string0 + " blir " + backwards(string0) + " baklänges.");
System.out.println("Ordet " + string1 + " blir " + backwards(string1) + " baklänges.");
    }

}