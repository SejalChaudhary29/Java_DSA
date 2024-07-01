public class TypePromotion {
    public static void main(String[] args) {
        // promote char, byte, short into int  when/ evaluating an expression
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a)); //type casting
        System.out.println(b-a); //typePromotion

        //example 2 
        short s = 5;
        byte by = 27;
        char d = 'd';
        byte bt = (byte) (s + by + d);// type casting and type promotion
        System.out.println(bt);

        //example 3 
        //if one operand is float long or double the whole expression is promoted to long float double respectively
         int abc = 89;
         float ft = 20.65f;
         long lg = 45;
         double db = 30;
         double sum = abc + ft + lg + db;
          System.out.println(sum);

    }
}
