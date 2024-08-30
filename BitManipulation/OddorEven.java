package BitManipulation;
import java.util.*;
public class OddorEven {
    public static void oddEven(int n ){
        int Bit = 1;
        if ((n & Bit) == 0) {
            //even num
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
          }
          public static void main(String[] args) {
            oddEven(9);//odd Number
            oddEven(2);//even
            oddEven(19);//odd
          }
}
