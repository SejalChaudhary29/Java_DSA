package Function;

public class Callbyvalue {
    public static int ChangeA(int a ) {
         a = 15;
        //  System.out.println(a); // 15 
         return a;
        
    }
    //java always calls by a value
    public static void main(String[] args) {
        int a = 10;
        ChangeA(a);
        System.out.println(a);//10
    }
}
