package DSA_Algorithm;

public class LinearSearch {
    public static int linearSearch( int num [], int key){
         for (int i = 0; i < num.length; i++) {
            if( num[i] == key){
                return i;
            }
         }
    return -1;
    }
    public static void main(String[] args) {
        int num[] = { 78 , 98 , 90};
        int key = 90;
       int index = linearSearch(num, key);
       if(index == -1){
        System.out.println("N0T FOUND");

       }else{
        System.out.println( "Key is at index: " +index);
       }
        
    }
}
