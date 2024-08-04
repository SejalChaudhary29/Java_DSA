package DSA_Algorithm;
import java.util.Arrays;
import java.util.Collections;

public class InbuildSort {
    // Time complexoty is O(n log n)
    public static void main(String[] args) {
        Integer arr[] = { 5 , 4 , 1 , 9, 7};
        // Arrays.sort(arr); //ascending order 1 4 5 7 9
        // Arrays.sort(arr, 0 , 3);//1 4 5 9 7 
        // Arrays.sort(arr , Collections.reverseOrder()); //9 7 5 4 1 
        Arrays.sort(arr ,0 , 2, Collections.reverseOrder()); //9 7 5 4 1 
       for (int i = 0; i < arr.length; i++) {
        
           System.out.print( arr[i] + " ");
        }
    }
}
