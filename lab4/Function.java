public class Function {
    public static int intToString(int i) {
return i*2;
    }
    
    public static void main(String[] args) {
System.out.println(intToString(Integer.parseInt(args[0])));
    }
}