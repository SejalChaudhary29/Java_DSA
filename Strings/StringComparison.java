package Strings;

;

public class StringComparison {
    // here s1 and s2 are equal. as in this the s2 = sejal pointing towards the s1=
    // sejal
    // s1 & s3 are not equal because of the interning concept as the new keyword in
    // s3 indicates that the new string created of name sejal
    // == checks at the object level and in string for checking the only value we
    // use (s1.equals(s3))
    public static void main(String[] args) {
        String s1 = "Sejal";
        String s2 = "Sejal";
        String s3 = new String("Sejal");
        //s1 and s2 are equal
        if (s1 == s2) {
            System.out.println(" strings are equal");

        } else {
            System.out.println("Strings are not equal");
        }
        //s1 and s3 are not equal
        if (s1 == s3) {
            System.out.println(" String are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        //s1 and s3 are equal
        if (s1.equals(s3)) {
            System.out.println(" String are equal");
        } else {
            System.out.println("Strings are not equal");
        }
            
        }
    }

