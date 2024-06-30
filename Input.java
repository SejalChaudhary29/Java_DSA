import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //String
        String input = sc.next(); //this function only until the space didnt comes 
        String inputs = sc.nextLine();  // this function captures with spaces and paragrphs 
        System.out.print(input);//sejal
        System.out.print(inputs); //sejal chaudhary
        //Integer
        int  number = sc.nextInt();
        System.out.println(number);
        //Float
         float price = sc.nextFloat();
         System.out.println(price);
    }
}
