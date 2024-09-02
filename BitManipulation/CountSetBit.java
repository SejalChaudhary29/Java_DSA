package BitManipulation;
 public class CountSetBit {
    // Set bits are those bits which are 1
 public static int CountSetbits(int n){
    int Count = 0;
    while (n >0) {
        if ((n & 1) !=0) {
            Count++;
        }
         n = n>>1;
    }
    return Count;
 }
     public static void main(String[] args) {
        System.out.println(CountSetbits(10)); //2
     }
 }