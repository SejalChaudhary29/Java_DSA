package BitManipulation;

public class ClearIthBit {
    // Clear ith Bit operation is used to set the ith bit of a Number to 0
    public static int ClearIthBit(int n , int i){
        int Bitmask = ~(1<<i);
        return n & Bitmask;
    }
    public static void main(String[] args) {

        // n = 8 =>1000 1 => 0001 , (1<<1)=> 0010, 
        // ~(0010)=> 1101

        // 1000 &  1101=> 1000 (8)
        System.out.println(ClearIthBit(10, 1));//8
    }
}
