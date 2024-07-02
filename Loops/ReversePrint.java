package Loops;

public class ReversePrint {
    public static void main(String[] args) {
        
        int n = 29033;
        while(n > 0){
             int lastDigit = n % 10;
             System.out.print( lastDigit);
             n = n/ 10;

        }
        System.out.println(" Reverse number");
    }
}
