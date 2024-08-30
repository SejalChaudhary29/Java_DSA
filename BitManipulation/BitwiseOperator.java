package BitManipulation;

public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println(5&6);//AND Operator  ( 1 & 1 = 1(true) and rest of all false)
        System.out.println(5|6);//OR Operator ( 0 | 0 = 0(false) and rest of all true))
        System.out.println(5^6);//XOR Operator (same bit are always False)
        System.out.println(~5);//1's Complement Operator
        System.out.println(5<<2);//Binary Left shift Operator (a * b^2)
        System.out.println(5>>2);//Binary Right shift Operator(a / b^2)


    }
}
