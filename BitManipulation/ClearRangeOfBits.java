package BitManipulation;

public class ClearRangeOfBits {
    // Clearing a range of bits means setting all the bits from the i-th to the j-th position in a number to 0, while keeping the rest of the bits unchanged.
    public static int ClearRange(int n , int i , int j){
        int a = ((~0)<< j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ClearRange(10, 2,4));//2
    }
}
