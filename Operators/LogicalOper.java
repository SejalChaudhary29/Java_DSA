package Operators;

public class LogicalOper {
    public static void main(String[] args) {
         //logical operator
        //  AND ->  all statement should be true then it results true 
        // OR-> one of the statement should be true it results true
        // ! -> it alternate the statement result. true-> false and false-> true 
         System.out.println( (3<2) && (5>0)); //false
         System.out.println( (3<2) || (5>0)); //true
         System.out.println( !(3>2) ); //false

    }
}
