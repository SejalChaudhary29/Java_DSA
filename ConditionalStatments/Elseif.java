package ConditionalStatments;

public class Elseif {
    public static void main(String[] args) {
        int a = 2;
        if (a >= 18) {
            System.out.println("Adult");
        }
        else if(a >= 13 && a < 18){
            System.out.println("Teenager");
        } 
        else{
            System.out.println( "Kid");
        }  
    }
}
