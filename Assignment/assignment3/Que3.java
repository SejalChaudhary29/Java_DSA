package Assignment.assignment3;
import java.util.*;
public class Que3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         int num;
         int factorial = 1;
         System.out.println( "Enter a Number: ");
         num = sc.nextInt();
          for (int i = 1; i <= num; i++) {
            factorial *= i; 
            
          }
          System.out.println( "Factorial: "+ factorial);

    }
}
