package BitManipulation;

public class UpdateIthBit {
//   operation allows you ti set ith bit if a number to a specific value either 0 or 1
//    n & ~ (1<<i) | newBit <<i;
    public static int clearith(int n , int i){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }
    public static int UpdateBit(int n , int i , int newBit){
        n = clearith(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }
     public static void main(String[] args) {
       System.out.println(UpdateBit(10, 2, 1));
     }
}
