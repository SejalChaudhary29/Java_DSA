package Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        int marks[] = new int[40];
       Scanner sc = new Scanner(System.in);
       marks[0] = sc.nextInt();//input
       marks[1] = sc.nextInt();
       marks[2] = sc.nextInt();
       marks[3] = sc.nextInt();
     System.out.println("Physics " +marks[0]);//output
     System.out.println( "Chemistry " +marks[1]);
     System.out.println("Biology " +marks[2]);
     System.out.println("Mathematics " +marks[3]);
     marks[2] = 45; //update
     System.out.println("Biology " +marks[2]);
    }

}
