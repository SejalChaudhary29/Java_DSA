package Strings;
//Palindrome are those words which are same from the starting and same from the last  
//Tc = O(n)
public class StringPalindrome {
    public static boolean palindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n  = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)) {
                //not a palindrom
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String Palindrome = "noon";
         System.out.println(palindrome(Palindrome));
    }
}
