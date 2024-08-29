package Strings;

public class LargestString {

// lexicographic order is sequence of alphabets apple=> 'a' is smaller than banana=> 'b'
    public static void main(String[] args) {
    String fruits[] = {"apple","mango","banana"};
     String largest = fruits[0];
     for (int i = 0; i < fruits.length; i++) {
        if (largest.compareTo(fruits[i])< 0) {
            largest = fruits[i];
        }
     }
     System.out.println(largest);
    }
}
