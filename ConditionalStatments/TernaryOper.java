package ConditionalStatments;

public class TernaryOper {
    public static void main(String[] args) {
         int num = 4;
         String type = ((num%2) == 0)? "even": "odd";
         System.out.println(type);
    }
}
