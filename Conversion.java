public class Conversion {
    public static void main(String[] args) {
        /*conversion
         byte -> short->int->float->long->double 
         int->float */
         int a = 10;
         float b = a;
         System.out.println(b);// 10.0


//  Error  float -> int cannot be possible
        float a = 10;
        int b = a; 
        System.out.println(b);
    }
} 
