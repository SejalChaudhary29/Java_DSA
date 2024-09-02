package BitManipulation;
public class ClearLasti {
    // n & (-1)<<i 
    public static int ClearLastIBit(int n , int i){
         
        int Bitmask = (-1)<<i; // (~0)<<i;
        return n & Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ClearLastIBit(15, 2));
    }
}
