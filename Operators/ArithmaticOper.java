package Operators;

public class ArithmaticOper {
    public static void main(String[] args) {
        //Binary Operator
        int A = 200;
        int B = 20;
        System.out.println("Add "+ (A+B));
        System.out.println("Subtract "+( A-B));
        System.out.println("Multiply "+( A*B));
        System.out.println("Division "+( A/B));
        System.out.println("Modulus "+( A%B));
        //Unary Operator
        // pre-increment

        int a = 10;
        int b = ++a;
        System.out.println(a); //11
        System.out.println(b); //11

        // post-increment
        int c = 10;
        int d = c++;
        System.out.println(c); //10
        System.out.println(d); //11

        //pre-increment
        int abc = 10;
        int xyz = --abc;
        System.out.println(abc); //9
        System.out.println(xyz); //9
        //post-decrement 
        int e = 10;
        int f = e--;
        System.out.println(e); //9
        System.out.println(f); //10
    }

}
