package DSA_Algorithm;
import java.util.*;
public class LargestNumber {

    public static int largestNum(int num[]){
     int largeNum = Integer.MIN_VALUE;   
     int smallestNum = Integer.MAX_VALUE;   

     for (int i = 0; i < num.length; i++) {
        if(largeNum < num[i]){
            largeNum = num[i];
        }
        if ( smallestNum > num[i]) {
            smallestNum = num[i];
        }
        
    }
    System.out.println(" smallest num is: "+ smallestNum);
    return largeNum;
}
    public static void main(String[] args) {
        int num[]= {1 , 4 , 6 ,9 ,10};

        System.out.println("Largest Num is: " + largestNum(num));
    }
}
