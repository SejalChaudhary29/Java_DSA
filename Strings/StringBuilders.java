package Strings;
// stringbuilder is a datstructure as a String is
// the diff is between both the stringbuilder is created at once and the modification/changes can be made within it. in heap memory new object string will not ne created.
// TC = O(26);<- sb.appemd(i)
public class StringBuilders{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char i = 'a'; i <= 'z'; i++) {
           sb.append(i); 
        }

        System.out.println(sb);
    }
}

