package Strings;

public class StringSubstring {
    // Substring function created here 
    // inbuild function of substring in java str.substring(si , ei)
    public static String substring(String str , int si , int ei){
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
            
        }
        return substr;

    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        //inbuild function 
        System.out.println(str.substring(0 , 5)); // Hello
       System.out.println( substring(str, 0, 5)); //Hello
    }
}
