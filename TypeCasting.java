public class TypeCasting {
    public static void main(String[] args) {
        float a = 25.0f;
        // int b = a;
        int b = (int) a;  
        System.out.println(b);

        char ch = 'a';
        int num = ch;
        System.out.println(num); 
    }
}
