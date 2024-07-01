package Assignment;
import java.util.*;
public class Que3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float pencil = sc.nextFloat();  
      float pen = sc.nextFloat();  
      float eraser = sc.nextFloat();  
      float sum = (pencil + pen + eraser);
      float gst = (sum * 18)/100;
      System.out.println(" The bill of the customer with GST is: " + (sum + gst));

    }
}
