package Strings;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        char str[] = { 'a', 'b', 'c', 'd' }; // array of character
        System.out.println(str);

        // String syntax
        String str1 = "abcdxyz";
        System.out.println(str1);
        String str2 = new String("Sejal");
        System.out.println(str2);

        //  Input/Output
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();// sejal(prints 1 word)
        name = sc.nextLine();// sejal chaudhary(prints the line)
        System.out.println(name);

    }
}
