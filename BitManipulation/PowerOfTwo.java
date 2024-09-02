package BitManipulation;

public class PowerOfTwo {
    // power of 2 or not
    public static boolean PowerOFTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(PowerOFTwo(8));//true
    }
}
