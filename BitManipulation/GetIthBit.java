package BitManipulation;

public class GetIthBit {
    public static int GetIthBit(int n, int i) {
        // get ith bit  operations check wether the ith bit in Number is "1" or "0"
        int BitMask = 1 << i;

        if ((n & BitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // 8 => 1000 , 1=> 0001, (1<<2)=> 0100 
        // 1000 & 0100=> 0000
System.out.println(GetIthBit(8 , 2));// 0
    }
}
