package BitManipulation;

public class SetIthBit {
    // set ith Bit operation changes the ith bit in a Number to 1
    public static int SetIthBit(int n , int i){
        int BitMask = 1<<i;
        return n | BitMask;
    }
    public static void main(String[] args) {
        System.out.println(SetIthBit(10, 2));//14
    }
}
