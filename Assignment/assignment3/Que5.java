package Assignment.assignment3;

public class Que5 {
    public static void main(String[] args) {
        
         for (int i = 0; i<=5 ; i++) {
            System.out.println("i = " + i);

         }
         System.out.println(" i after the loop " + i); // gives error as i declared inside the loop and its this is out of scope {} of forloop.
         // to have global access variable should be declare outside the loop.
    }
}
